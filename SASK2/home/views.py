from django.shortcuts import get_object_or_404, render_to_response
from django.http import Http404, HttpResponse, HttpResponseRedirect
from django.contrib.auth.decorators import login_required

#@login_required
def home(request):
    return render_to_response('home/home.html')

def Add(request):
	return render_to_response('home/add.html')

def Edit(request):
	return render_to_response('home/edit.html')

def Export(request):
	return render_to_repsonse('home/export.html')
