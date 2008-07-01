from django.shortcuts import render_to_response
from django.http import HttpResponse
from django.core.urlresolvers import reverse
import csv
from django.template.defaultfilters import slugify
from SASK2.plots.models import *
from SASK2.trees.models import *

def ExportTreeData(request):
	R1 = request.POST.get('TreeSurveyRange1','-1')
	R2 = request.POST.get('TreeSurveyRange2','-1')
	R1 = int(R1)
	R2 = int(R2)
	trees = Tree.objects.all()
	Output = 'tag\tspecies\tplot\tsubplot\tquadrate'
	if R1 == 1 and R2 == 1:
		Output += '\t1_date\t1_dbh\t1_height\t1_canopy_width1\t1_canopy_width2\t1_measured_by\t1_tallied_by'
		for tree in trees:
			Output += '\n%s\t%s\t%s\t%s\t%s' % (tree.tag, tree.species, tree.plot, tree.subplot, tree.quadrate)
			survey = TreeSurvey.objects.filter(tree = tree).order_by('date')[:1]
			if len(survey) == 1:
				survey = survey[0]
				Output += '\t%s\t%s\t%s\t%s\t%s\t%s\t%s' % (survey.date, survey.dbh, survey.height, survey.canopy_width1, survey.canopy_width2, survey.measured_by, survey.tallied_by)
			else:
				Output += '\t\t\t\t\t\t\t'
	elif R1 == 1 and R2 == 2:
		Output += '\t1_date\t1_dbh\t1_height\t1_canopy_width1\t1_canopy_width2\t1_measured_by\t1_tallied_by\t2_date\t2_dbh\t2_height\t2_canopy_width1\t2_canopy_width2\t2_measured_by\t2_tallied_by'
		for tree in trees:
			Output += '\n%s\t%s\t%s\t%s\t%s' % (tree.tag, tree.species, tree.plot, tree.subplot, tree.quadrate)
			surveys = TreeSurvey.objects.filter(tree= tree).order_by('date')[:2]
			if len(surveys) == 0:
				Output += '\t\t\t\t\t\t\t'
				Output += '\t\t\t\t\t\t\t'
			if len(surveys) == 1:
				Output += '\t%s\t%s\t%s\t%s\t%s\t%s\t%s' % (surveys[0].date, surveys[0].dbh, surveys[0].height, surveys[0].canopy_width1, surveys[0].canopy_width2, surveys[0].measured_by, surveys[0].tallied_by)
				Output += '\t\t\t\t\t\t\t'
			if len(surveys) == 2:
				Output += '\t%s\t%s\t%s\t%s\t%s\t%s\t%s' % (surveys[0].date, surveys[0].dbh, surveys[0].height, surveys[0].canopy_width1, surveys[0].canopy_width2, surveys[0].measured_by, surveys[0].tallied_by)
				Output += '\t%s\t%s\t%s\t%s\t%s\t%s\t%s' % (surveys[1].date, surveys[1].dbh, surveys[1].height, surveys[1].canopy_width1, surveys[1].canopy_width2, surveys[1].measured_by, surveys[1].tallied_by)
	elif R1 == 2 and R2 == 2:
		Output += '\t2_date\t2_dbh\t2_height\t2_canopy_width1\t2_canopy_width2\t2_measured_by\t2_tallied_by'
		for tree in trees:
			Output += '\t%s\t%s\t%s\t%s\t%s' % (tree.tag, tree.species, tree.plot, tree.subplot, tree.quadrate)
			surveys = TreeSurvey.objects.filter(tree= tree).order_by('date')[:2]
			if len(surveys) == 0:
				Output += '\t\t\t\t\t\t\t'
			if len(surveys) == 1:
				Output += '\t\t\t\t\t\t\t'
			if len(surveys) == 2:
				Output += '\t%s\t%s\t%s\t%s\t%s\t%s\t%s' % (surveys[1].date, surveys[1].dbh, surveys[1].height, surveys[1].canopy_width1, surveys[1].canopy_width2, surveys[1].measured_by, surveys[1].tallied_by)
	else:
		return HttpResponse('Please return and enter a valid range.')
	response = HttpResponse(Output)
	response['Content-Type'] = 'application/x-CBioD-tab-delimited-data'
	response['Content-disposition'] = 'Attachment; filename=%s' % (request.POST.get('TreeFileName','TreeData.txt'),)
	return response; 

def ExportPlotData(request):
	PlotDict = {}
	TreeList = []
	PlotList = request.POST.getlist('plot')
	while '' in PlotList:
		PlotList.remove('')
	while u'' in PlotList:
		PlotList.remove(u'')
#	if len(PlotList) == 0:
#		return HttpResponse('error')
	for PlotID in PlotList:
		plot = Plot.objects.get(id = PlotID)
		PlotDict[PlotID] = {'Plot':plot}
		trees = Tree.objects.filter(plot=plot)
		for tree in trees:
			if tree.species.spcode in TreeList:
				x = 1
			else:
				TreeList.append(tree.species.spcode)
			if tree.species.spcode in PlotDict[PlotID]:
				PlotDict[PlotID][tree.species.spcode] = 1 + PlotDict[PlotID][tree.species.spcode] 
			else:
				PlotDict[PlotID][tree.species.spcode] = 1
	Output = ''
	Output += 'forest_reserve\tcompartment\tbaseline_bearing\twidth\tlength\tlatitude\tlongitude'
	for tree in TreeList:
		Output += '\t%s' % tree
	for plot in PlotDict:
		plot = PlotDict[plot]
		Output += '\n'
		p = plot['Plot']
		Output += '%s\t%s\t%s\t%s\t%s\t%s\t%s' % (p.forest_reserve,p.compartment,p.baseline_bearing,p.width,p.length,p.latitude,p.longitude)
		for tree in TreeList:
			if tree in plot:
				Output += '\t%s' % (plot[tree],)
			else:
				Output += '\t0'
	response = HttpResponse(Output)
	response['Content-Type'] = 'application/x-CBioD-tab-delimited-data'
	response['Content-disposition'] = 'Attachment; filename=%s' % (request.POST.get('PlotFileName','PlotData.txt'),)
	return response; 
def export(request, model):
	"""
	Message = model.__name__
	return render_to_response('debug.html',{'Message':Message})
	"""
	response = HttpResponse(mimetype='text/csv')
	response['Content-Disposition'] = 'attachment; filename=%s.csv' % slugify(model.__name__)
	writer = csv.writer(response)
	# Write headers to CSV file
	headers = []
	for field in model._meta.fields:
		headers.append(field.name)
	writer.writerow(headers)
	# Write data to CSV file
	print model.objects.all()
	for obj in model.objects.all().order_by("id"):
		row = []
		for field in model._meta.fields:
			row.append(getattr(obj, field.name))
		writer.writerow(row)
	# Return CSV file to browser as download
	return response

def home(request):
	return render_to_response('data/home.html')
