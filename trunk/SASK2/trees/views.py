from django.shortcuts import render_to_response
from SASK2.trees.models import Tree, TreeSurvey
from SASK2.trees.forms import * 
from django.core.urlresolvers import reverse
from django.core import serializers
from django.http import HttpResponse

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
		Errors = '%s%s' % (Errors,request.POST.get('Survey1-date','nothing'))
		return HttpResponse(Errors)
		#return render_to_response('trees/TreeSurveyForm.html',{'form':treesurveyform});
