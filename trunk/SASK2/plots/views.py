from django.shortcuts import render_to_response
from django.db.models import Q
from SASK2.plots.models import Plot, Subplot, Quadrate, PlotSurvey, SubplotSurvey, QuadrateSurvey
from SASK2.plots.forms import * 
from django.core.urlresolvers import reverse
from django.core import serializers
from django.http import HttpResponse

def AddPlot(request):
	Message = ''
	if request.method == 'POST':
		if request.POST['Submit'] == 'Submit Plot Data (with survey)':
			PSF = UnlinkedPlotSurveyForm(data=request.POST)
			PF = PlotForm(data=request.POST)
			if PF.is_valid() == False or PSF.is_valid() == False:
				Message += 'Please check the data for errors.'
				return render_to_response('plots/add.html',{'PlotForm':PF,'PlotSurveyForm':PSF,'Message':Message,'ShowSurvey':True})
			else:
				plot = PF.save()
				PopulatePlot(plot)
				plotsurvey = PSF.save(commit=False)
				plotsurvey.plot = plot
				plotsurvey.save()
				Message += 'The plot and survey data were successfully added: %s' % plot
				PF = PlotForm()
				PSF = UnlinkedPlotSurveyForm()
				return render_to_response('plots/add.html', {'PlotForm':PF,'PlotSurveyForm':PSF,'Message':Message})
		elif request.POST['Submit'] == 'PlotlessSurvey':
			PSF = UnlinkedPlotSurveyForm(data=request.POST)
			PF = PlotForm()
			return render_to_response('plots/add.html', {'Message':'ok','PlotForm':PF,'PlotSurveyForm':PSF,'Message':Message,'ShowSurvey':True})
		else:
			PF = PlotForm(data=request.POST)
			if PF.is_valid():
				plot = PF.save()
				PopulatePlot(plot)
				Message += 'Plot successfully saved: %s' % plot 
				PF = PlotForm()
				PSF = UnlinkedPlotSurveyForm()
				return render_to_response('plots/add.html',{'PlotForm':PF,'PlotSurveyForm':PSF,'Message':Message})
			else:
				Message += 'Please check the data for errors.'
				PSF = UnlinkedPlotSurveyForm()
				return render_to_response('plots/add.html',{'PlotForm':PF,'PlotSurveyForm':PSF,'Message':Message})
	else:
		PF = PlotForm()
		PSF = UnlinkedPlotSurveyForm()	
	return render_to_response('plots/add.html',{'PlotForm':PF,'PlotSurveyForm':PSF,'Message':Message})

def PopulatePlot(plot):
	for i in range(1,5):
		subplot = Subplot(plot = plot, number = i)
		subplot.save()
		for j in range(1,5):
			quadrate = Quadrate(subplot = subplot, number = j)
			quadrate.save()

def AddPlotSurvey(request):
	Message = ''
	if request.method == 'POST':
		PSF = PlotSurveyForm(data=request.POST)
		if PSF.is_valid():
			plotsurvey = PSF.save()
			Message += 'Plot survey successfully added to plot (%s)' % plotsurvey.plot
			PSF = PlotSurveyForm()
			return render_to_response('plots/addsurvey.html', {'PlotSurveyForm':PSF,'Message':Message})
		else:
			Message += 'Please review the data for errors.'
			return render_to_response('plots/addsurvey.html', {'PlotSurveyForm':PSF,'Message':Message})
	else:
		PSF = PlotSurveyForm()
		return render_to_response('plots/addsurvey.html', {'PlotSurveyForm':PSF,'Message':Message})

def home(request):
	return render_to_response('plots/home.html')

def list(request):

	latitude = request.GET.get('latitude', '')
	longitude = request.GET.get('longitude', '')
	baseline_bearing = request.GET.get('baseline_bearing', '')
	width = request.GET.get('width', '')
	length = request.GET.get('length', '')
	forest_reserve = request.GET.get('forest_reserve', '')
	compartment = request.GET.get('compartment', '')

	results = Plot.objects.all()

	if(longitude):
		results = results.filter(longitude__exact = float(longitude))
	
	if(latitude):
		results = results.filter(latitude__exact = float(latitude))

	if(length):
		results = results.filter(length__exact = int(length))

	if(width):
		results = results.filter(width__exact = int(width))

	if(baseline_bearing):
		results = results.filter(baseline_bearing__exact = float(baseline_bearing))

	if(forest_reserve):
		results = results.filter(forest_reserve__istartswith = forest_reserve)

	if(compartment):
		results = results.filter(compartment__exact = int(compartment))
	return render_to_response('plots/list.html', {'results':results})

def GetSubplotsOfPlot(request):
	PlotID = request.GET.get('PlotID','')
	ThePlot = Plot.objects.get(id=PlotID)
	data = serializers.serialize("json", Subplot.objects.filter(plot=ThePlot))
	return HttpResponse(data, mimetype="application/javascript")

def GetQuadratesOfSubplot(request):
	SubplotID = request.GET.get('SubplotID','')
	TheSubplot = Subplot.objects.get(id=SubplotID)
	data = serializers.serialize("json", Quadrate.objects.filter(subplot=TheSubplot))
	return HttpResponse(data, mimetype="application/javascript")

def AddSubplot(request):
	Title = "Add subplot"
	PageTitle = Title
	ButtonLabel = "add subplot"
	Message = ""
	SubplotInstance = Subplot()
	if request.POST:
		Form = SubplotForm(data = request.POST, instance = SubplotInstance)
		if Form.is_valid():
			SavedSubplot = Form.save()
			Message = "Subplot successfully added (%s)." % SavedSubplot
			Form = SubplotForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = SubplotForm(instance=SubplotInstance)
	return render_to_response('add.html',{'Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddSubplot")})
	
def AddQuadrate(request):
	Title = "Add Quadrate"
	PageTitle = Title
	ButtonLabel = "add quadrate"
	Message = ""
	QuadrateInstance = Quadrate()
	if request.POST:
		Form = QuadrateForm(data = request.POST, instance = QuadrateInstance)
		if Form.is_valid():
			SavedQuadrate = Form.save()
			Message = "Quadrate successfully added (%s)." % SavedQuadrate
			Form = QuadrateForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = QuadrateForm(instance=QuadrateInstance)
	return render_to_response('add.html',{'AddPlot':'True','Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddQuadrate")})

def AddSubplotSurvey(request):
	Title = "Subplot Survey"
	PageTitle = Title
	ButtonLabel = "submit subplot survey"
	Message = ""
	SubplotSurveyInstance = SubplotSurvey()
	if request.POST:
		Form = SubplotSurveyForm(data = request.POST, instance = SubplotSurveyInstance)
		if Form.is_valid():
			SavedSubplotSurveyForm = Form.save()
			Message = "Subplot survey successfully added (%s)." % SavedSubplotSurveyForm
			Form = SubplotSurveyForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = SubplotSurveyForm(instance=SubplotSurveyInstance)
	return render_to_response('add.html',{'AddPlot':'True','Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddSubplotSurvey")})

def AddQuadrateSurvey(request):
	Title = "Quadrate Survey"
	PageTitle = Title
	ButtonLabel = "submit quadrate survey"
	Message = ""
	QuadrateSurveyInstance = QuadrateSurvey()
	if request.POST:
		Form = QuadrateSurveyForm(data = request.POST, instance = QuadrateSurveyInstance)
		if Form.is_valid():
			SavedQuadrateSurvey = Form.save()
			Message = "Quadrate survey successfully added (%s)." % SavedQuadrateSurvey
			Form = QuadrateSurveyForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = QuadrateSurveyForm(instance=QuadrateSurveyInstance)
	return render_to_response('add.html',{'AddPlot':'True','AddSubplot':'True','Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddQuadrateSurvey")})

def GetAllPlots(request):
	data = serializers.serialize("json", Plot.objects.all())
	return HttpResponse(data, mimetype="application/javascript")

def EditPlotSubmenu(request):
	PlotID = request.POST.get('PlotID','')
	if isinstance(int(PlotID),(int,)) == False:
		return HttpResponse('Please make a valid choice')
	plot = Plot.objects.filter(id=PlotID)
	if len(plot) != 1:
		return HttpResponse('Please make a valid choice')
	plot = plot[0]
	plotsurveys = PlotSurvey.objects.filter(plot=plot)
	if len(plotsurveys) > 0:
		PSSF = PlotSurveySelectorForm(plot=plot)
		return render_to_response('plots/EditPlotSubmenu.html', {'PlotID':PlotID,'PlotSurveySelectorForm':PSSF})
	else:
		return render_to_response('plots/EditPlotSubmenu.html', {'PlotID':PlotID})
		
def EditPlot(request, PlotID=''):
	PlotID = int(PlotID)
	Title = PageTitle = "Edit Plot Information"
	Message = ''
	if request.method == 'POST':
		pf = PlotForm(data = request.POST)
		if pf.is_valid():
			p = pf.save(commit=False)
			p.id = PlotID
			p.save()
			Message += 'The edit was successfully made.'
			return render_to_response('home/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':pf,'Message':Message})
		else:
			Message += 'Please check the data for errors.'
			return render_to_response('home/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':pf,'Message':Message})
	else:
		plot = Plot.objects.get(id=PlotID)
		pf = PlotForm(instance=plot)
		return render_to_response('home/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':pf,'Message':Message})

def EditPlotSurvey(request, PlotSurveyID=''):
	PlotSurveyID = int(PlotSurveyID)
	Title = PageTitle = "Edit Plot Survey"
	Message = ''
	if request.method == 'POST':
		ppsf = PlotlessPlotSurveyForm(data = request.POST)
		if ppsf.is_valid():
			ps = ppsf.save(commit=False)
			ps.id = PlotSurveyID
			ps.save()
			Message += 'The edit was successfully made.'
			return render_to_response('home/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':ppsf,'Message':Message})
		else:
			Message += 'Please check the data for errors.'
			return render_to_response('home/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':ppsf,'Message':Message})
	else:
		plotsurvey = PlotSurvey.objects.get(id=PlotSurveyID)
		ppsf = PlotlessPlotSurveyForm(instance=plotsurvey)
		return render_to_response('home/MakeEdit.html',{'Title':Title,'PageTitle':PageTitle,'Form':ppsf,'Message':Message})
		
