from django.shortcuts import render_to_response
from django.http import HttpResponse
from django.core.urlresolvers import reverse
import csv
from django.template.defaultfilters import slugify

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
