from django.shortcuts import get_object_or_404, render_to_response
from django.db import connection
from django.http import Http404, HttpResponse, HttpResponseRedirect
from django.contrib.auth.decorators import login_required
from SASK2.plots.forms import *
from SASK2.trees.forms import * 

def home(request):
	return render_to_response('home/home.html')

def Add(request):
	PlotSelector1 = PlotSelectorForm(prefix=1)
	PlotSelector2 = PlotSelectorForm(prefix=2)
	PlotSelector3 = PlotSelectorForm(prefix=3)
	return render_to_response('home/add.html', {'PlotSelector1':PlotSelector1,'PlotSelector2':PlotSelector2,'PlotSelector3':PlotSelector3})

def Edit(request):
	TSF = TreeSelectorForm()
	PSF = PlotSelectorForm()
	return render_to_response('home/edit.html', {'PlotSelectorForm':PSF,'TreeSelectorForm':TSF})

def Export(request):
	MPSF = MultiplePlotSelectorForm()
	return render_to_response('home/export.html', {'MultiplePlotSelectorForm':MPSF})

def test(request):
	cursor = connection.cursor()
	cursor.execute('select * from ImageTest;')
	row = cursor.fetchone()
        response = HttpResponse(row[1])
        response['Content-Type'] = 'image/jpeg'
        #response['Content-disposition'] = 'Attachment; filename=frog.jpg'
        return response 

