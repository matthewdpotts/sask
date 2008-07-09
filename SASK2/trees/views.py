from django.shortcuts import render_to_response
from django.core.urlresolvers import reverse
from django.core import serializers
from django.http import HttpResponse
from SASK2.plots.models import *
from SASK2.personnel.forms import *
from SASK2.trees.models import * 
from SASK2.trees.forms import * 

def NewTreePlotSurvey(request, PlotID=''):
	plot = Plot.objects.get(id=PlotID)
	Message = ''
	if request.method == 'POST':
		TreePlotSurveyID = request.POST.get('TreePlotSurveyID','')
		tpsf = TreePlotSurveyForm(data = request.POST)
		if tpsf.is_valid():
			if TreePlotSurveyID == '':
				tps = tpsf.save()
			else:
				tps = tpsf.save(commit = False)
				tps.id = int(TreePlotSurveyID)
				tps.save()
			TreePlotSurveyID = tps.id
		else:
			Message = 'The data could not be saved; please check for errors.'
			TreePlotSurveyID = ''
		subplots = Subplot.objects.filter(plot=plot)
		quadrates = []
		for subplot in subplots:
			quadrates.extend(Quadrate.objects.filter(subplot=subplot))
		Forms = []
		for quadrate in quadrates:
			Form = TreeQuadrateSurveyForm(data=request.POST, prefix=str(quadrate.id))
			Form.q = quadrate 
			if Form.is_valid() and tpsf.is_valid():
				tqs = Form.save(commit = False)
				tqs.treeplotsurvey = tps
				if tqs.GRS == '':
					tqs.GRS = None
				if tqs.canopy_photo_number == '':
					tqs.canopy_photo_number = None
				query = TreeQuadrateSurvey.objects.filter(treeplotsurvey=tps).filter(quadrate=quadrate)
				if len(query) == 1:
					tqs.id = query[0].id
				tqs.save()
			else:
				Message = 'The data could not be saved; please check for errors.'
			Forms.append(Form)
		return render_to_response('trees/NewTreePlotSurvey.html', {'Message':Message,'plot':plot,'TreePlotSurveyID':TreePlotSurveyID,'TreeQuadrateSurveyForms':Forms,'TreePlotSurveyForm':tpsf})
	TreePlotSurveyID = ''	
	subplots = Subplot.objects.filter(plot=plot)
	quadrates = []
	for subplot in subplots:
		quadrates.extend(Quadrate.objects.filter(subplot=subplot))
	treequadratesurveyforms = []
	for quadrate in quadrates:
		prefix = str(quadrate.id)
		subplot = quadrate.subplot
		tqsf = TreeQuadrateSurveyForm(data={prefix+'-quadrate':quadrate.id}, prefix=prefix)
		tqsf.q = quadrate
		treequadratesurveyforms.append(tqsf)
	tpsf = TreePlotSurveyForm(data = {'plot':plot.id})
	return render_to_response('trees/NewTreePlotSurvey.html', {'TreePlotSurveyID':TreePlotSurveyID,'plot':plot,'TreeQuadrateSurveyForms':treequadratesurveyforms,'TreePlotSurveyForm':tpsf})

def AddBigTreeSurvey(request, PlotID=''):
	Message = ''
	plot = Plot.objects.get(id = PlotID)
	SurveyID = request.POST.get('SurveyID','')
	if request.method == 'POST':
		SurveyForm = BigTreePlotSurveyForm(data=request.POST)
		TreeSurveyForm = BigTreeSurveyForm(data=request.POST)
		if SurveyForm.is_valid():
			Survey = SurveyForm.save(commit = False)
			if SurveyID != '':
				Survey.id = int(SurveyID)
			Survey.save()
			SurveyID = Survey.id
			Message += "SurveySaved"
			if TreeSurveyForm.is_valid():
				TreeSurvey = TreeSurveyForm.save(commit=False)
				TreeSurvey.bigtreeplotsurvey = Survey
				subplot = Subplot.objects.get(plot=plot, number=request.POST.get('subplot','a'))
				quadrate = Quadrate.objects.get(subplot = subplot, number='1')
				TreeSurvey.quadrate = quadrate
				TreeSurvey.save()
				Message += 'Tree Survey Saved'
		else:
			Message += "Survey Not Saved"
	else:
		SurveyForm = BigTreePlotSurveyForm(data = {'plot':plot.id})
		TreeSurveyForm = BigTreeSurveyForm()
	if SurveyID != '':
		S = BigTreePlotSurvey.objects.get(id=SurveyID)
		OldTreeSurveys = BigTreeSurvey.objects.filter(bigtreeplotsurvey=S)
	else:
		OldTreeSurveys = []
	return render_to_response('trees/AddBigTreeSurvey.html',{'Message':Message,'plot':plot,'SurveyForm':SurveyForm,'TreeSurveyForm':TreeSurveyForm,'OldTreeSurveys':OldTreeSurveys,'SurveyID':SurveyID})

def AddLittleTreeSurvey(request, PlotID=''):
	Message = ''
	plot = Plot.objects.get(id = PlotID)
	SurveyID = request.POST.get('SurveyID','')
	if request.method == 'POST':
		SurveyForm = LittleTreePlotSurveyForm(data=request.POST)
		TreeSurveyForm = LittleTreeSurveyForm(data=request.POST)
		if SurveyForm.is_valid():
			Survey = SurveyForm.save(commit = False)
			if SurveyID != '':
				Survey.id = int(SurveyID)
			Survey.save()
			SurveyID = Survey.id
			Message += "SurveySaved"
			if TreeSurveyForm.is_valid():
				TreeSurvey = TreeSurveyForm.save(commit=False)
				TreeSurvey.littletreeplotsurvey = Survey
				subplot = Subplot.objects.get(plot=plot, number=request.POST.get('subplot'))
				quadrate = Quadrate.objects.get(subplot = subplot, number=request.POST.get('q'))
				TreeSurvey.quadrate = quadrate
				TreeSurvey.save()
				Message += 'Tree Survey Saved'
		else:
			Message += "Survey Not Saved"
	else:
		SurveyForm = LittleTreePlotSurveyForm(data = {'plot':plot.id})
		TreeSurveyForm = LittleTreeSurveyForm()
	if SurveyID != '':
		S = LittleTreePlotSurvey.objects.get(id=SurveyID)
		OldTreeSurveys = LittleTreeSurvey.objects.filter(littletreeplotsurvey=S)
	else:
		OldTreeSurveys = []
	return render_to_response('trees/AddLittleTreeSurvey.html',{'Message':Message,'plot':plot,'SurveyForm':SurveyForm,'TreeSurveyForm':TreeSurveyForm,'OldTreeSurveys':OldTreeSurveys,'SurveyID':SurveyID})

def GetTreeSurveyForm(request):
	Message = ''
	if request.method == 'POST' and request.POST.get('BlankFormRequest',False)==False:
		treeform = TreeForm(data = request.POST)
		unlinkedtreesurveyform = UnlinkedTreeSurveyForm(data = request.POST)
		if treeform.is_valid() and unlinkedtreesurveyform.is_valid():
			tree = treeform.save(commit = False)
			Matches = Tree.objects.filter(tag = tree.tag)
			if len(Matches) > 0:
				treeform.errors['tag'] = ('A tree with this tag number has already been added.',)
				Message += 'Please check the data for errors.'
				return render_to_response('trees/NewTreeSurveyForm.html',{'TreeForm':treeform,'TreeSurveyForm':unlinkedtreesurveyform})
			tree.save()
			treesurvey = unlinkedtreesurveyform.save(commit = False)
			treesurvey.tree = tree
			treesurvey.save()
			Message += 'Tree (%s) and TreeSurvey (%s) successfully added' % (tree,treesurvey)
			return render_to_response('trees/NewTreeSurveyForm.html',{'Tree':tree,'TreeSurvey':treesurvey})
		else:
			Message += 'Please check the data for errors.'
			return render_to_response('trees/NewTreeSurveyForm.html',{'TreeForm':treeform,'TreeSurveyForm':unlinkedtreesurveyform,'Message':Message})
	else:
		treeform = TreeForm()
		unlinkedtreesurveyform = UnlinkedTreeSurveyForm()
		return render_to_response('trees/NewTreeSurveyForm.html',{'TreeForm':treeform,'TreeSurveyForm':unlinkedtreesurveyform})

def NewTreeSurvey(request):
	return render_to_response('trees/NewTreeSurvey.html')

def SecondTreeSurvey(request):
	Entries = []
	AllTrees = Tree.objects.all()
	for tree in AllTrees:
		Entry = [tree,]
		TwoSurveys = TreeSurvey.objects.all().filter(tree=tree).order_by('date')[:2]
		Entry.extend(TwoSurveys)
		#Entry[1] = TreeSurveyForm(instance=Entry[1])
		if len(Entry) == 3:
			Entry[2] = TreeSurveyForm(instance=Entry[2], prefix='Survey%s' % (Entry[0].tag,))
		else:
			treesurvey = TreeSurvey(tree = Entry[0])
			Entry.append(TreeSurveyForm(instance=treesurvey, prefix='Survey%s' % (Entry[0].tag,)))		
		Entries.append(Entry)

	return render_to_response('trees/SecondTreeSurvey.html', {'Entries':Entries})

def SubmitTreeSurveyForm(request):
	treesurveyform = TreeSurveyForm(data=request.POST, prefix='Survey%s' % request.POST.get('TagNumber',''))
	if treesurveyform.is_valid():
		treesurvey = treesurveyform.save()
		return HttpResponse('%s' % (treesurvey.tree.tag,))
	else:
		Errors = 'The survey couldn\'t be saved. Please check the following fields for errors:\n'
		for tag in treesurveyform.errors:
			Errors = '%s%s\n' % (Errors,tag)
		#Errors = '%s%s' % (Errors,request.POST.get('Survey1-date','nothing'))
		return HttpResponse(Errors)
		#return render_to_response('trees/TreeSurveyForm.html',{'form':treesurveyform});
def EditTreeSubmenu(request):
        TreeID = request.POST.get('TreeID','')
        if isinstance(int(TreeID),(int,)) == False:
                return HttpResponse('Please make a valid choice')
        tree = Tree.objects.filter(id=TreeID)
        if len(tree) != 1:
                return HttpResponse('Please make a valid choice')
        tree = tree[0]
        treesurveys = TreeSurvey.objects.filter(tree=tree)
        if len(treesurveys) > 0:
                TSSF = TreeSurveySelectorForm(tree=tree)
                return render_to_response('trees/EditTreeSubmenu.html', {'TreeID':TreeID,'TreeSurveySelectorForm':TSSF})
        else:
                return render_to_response('trees/EditTeeSubmenu.html', {'TreeID':TreeID})

def EditTree(request, TreeID=''):
	TreeID = int(TreeID)
	Title = PageTitle = "Edit Tree Information"
	Message = ''
	if request.method == 'POST':
		tf = TreeForm(data = request.POST)
		if tf.is_valid():
			t = tf.save(commit=False)
			t.id = TreeID
			t.save()
			Message += 'The edit was successfully made.'
		else:
			Message += 'Please check the data for errors.'
	else:
		tree = Tree.objects.get(id=TreeID)
		tf = TreeForm(instance=tree)
	return render_to_response('trees/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':tf,'Message':Message})

def EditTreeSurvey(request, TreeSurveyID=''):
	TreeSurveyID = int(TreeSurveyID)
	Title = PageTitle = "Edit Tree Survey"
	Message = ''
	if request.method == 'POST':
		tsf = TreeSurveyForm(data = request.POST)
		if tsf.is_valid():
			ts = tsf.save(commit=False)
			ts.id = TreeSurveyID
			ts.save()
			Message += 'The edit was successfully made.'
		else:
			Message += 'Please check the data for errors.'
	else:
		treesurvey = TreeSurvey.objects.get(id=TreeSurveyID)
		tsf = TreeSurveyForm(instance=treesurvey)
	return render_to_response('trees/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':tsf,'Message':Message})

