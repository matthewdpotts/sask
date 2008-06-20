from django.shortcuts import get_object_or_404, render_to_response
from django.http import Http404, HttpResponse, HttpResponseRedirect
from django.contrib.auth.decorators import login_required
from SASK2.plots.forms import PlotSelectorForm
from SASK2.trees.forms import TreeSelectorForm

#@login_required
def home(request):
    return render_to_response('home/home.html')

def Add(request):
	return render_to_response('home/add.html')

def Edit(request):
	TSF = TreeSelectorForm()
	PSF = PlotSelectorForm()
	return render_to_response('home/edit.html', {'PlotSelectorForm':PSF,'TreeSelectorForm':TSF})

def Export(request):
	return render_to_repsonse('home/export.html')

