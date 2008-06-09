from django.shortcuts import render_to_response
from django.db.models import Q
from SASK2.plots.models import Plot, Subplot, Quadrate, PlotSurvey, SubplotSurvey, QuadrateSurvey
from SASK2.plots.forms import PlotForm, SubplotForm, QuadrateForm, PlotSurveyForm, SubplotSurveyForm, QuadrateSurveyForm
from django.core.urlresolvers import reverse
from django.core import serializers
from django.http import HttpResponse

#Test

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

def AddPlot(request):
	Title = "Add Plot"
	PageTitle = Title
	ButtonLabel = "add plot"
	Message = ""
	PlotInstance = Plot()
	if request.POST:
		Form = PlotForm(data = request.POST, instance = PlotInstance)
		if Form.is_valid():
			SavedPlot = Form.save()
			Message = "Plot successfully added (%s)." % SavedPlot
			Form = PlotForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = PlotForm(instance=PlotInstance)
	return render_to_response('add.html',{'Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddPlot")})

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

def AddPlotSurvey(request):
	Title = "Plot Survey"
	PageTitle = Title
	ButtonLabel = "submit plot survey"
	Message = ""
	PlotSurveyInstance = PlotSurvey()
	if request.POST:
		Form = PlotSurveyForm(data = request.POST, instance = PlotSurveyInstance)
		if Form.is_valid():
			SavedPlotSurvey = Form.save()
			Message = "Plot survey successfully saved (%s)." % SavedPlotSurvey
			Form = PlotSurveyForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = PlotSurveyForm(instance=PlotSurveyInstance)
	return render_to_response('add.html',{'Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddPlotSurvey")})

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
