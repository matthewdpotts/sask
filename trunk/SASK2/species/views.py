from django.db.models import Q
from django.shortcuts import render_to_response
from django.http import HttpResponseRedirect
from django.core.urlresolvers import reverse
from models import Species
from models import TreeSpecies
from forms import SpeciesForm

def search(request):
	query = request.POST.get('q', '')
	if query:
		qset = (
			Q(spcode__icontains=query) |
			Q(family__icontains=query) |
			Q(genus__icontains=query) |
			Q(species__icontains=query)
		)
		results = Species.objects.filter(qset).distinct()
	else:
		results = []
	return render_to_response("species/search.html", {
		"results":results,
		"query":query
	})

def list(request):
	family = request.GET.get('family', '!')
	genus = request.GET.get('genus', '!')
	species = request.GET.get('species', '!')
	spcode = request.GET.get('spcode', '!')
	
        qset = (
		Q(family__istartswith=family) |
		Q(genus__istartswith=genus) |
		Q(species__istartswith=species) |
		Q(spcode__istartswith=spcode) 	
        )

	results = Species.objects.filter(qset).distinct()
	return render_to_response("species/list.html", {
		"results":results,

	})

def add(request):
	species = Species()
	if request.POST:
		form = SpeciesForm(data=request.POST, instance = species)
		if form.is_valid():
			form.save()
			return render_to_response('species/add.html', {'form':form})
		else: return render_to_response('species/add.html', {'form':form})	
	else:
		form = SpeciesForm(instance=species)
 		return render_to_response('species/add.html', {'form':form})