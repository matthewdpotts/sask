from django.db.models import Q
from django.shortcuts import render_to_response
from django.http import HttpResponseRedirect
from django.core.urlresolvers import reverse
from models import Species
from models import TreeSpecies
from forms import SpeciesForm

def Home(request):
	return render_to_response("species/home.html")

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


def AddSpecies(request):
	Title = "Add species"
	PageTitle = Title
	ButtonLabel = "add species"
	Message = ""
	SpeciesInstance = Species()
	if request.POST:
		Form = SpeciesForm(data = request.POST, instance = SpeciesInstance)
		Matches = Species.objects.filter(spcode = Form.data['spcode'])
		if Form.is_valid() and len(Matches) == 0:
			SavedSpecies = Form.save()
			Message = "Species successfully added (%s)." % SavedSpecies
			Form = SpeciesForm()
		else:
			Message = "There is an error in the form."
			if len(Matches) > 0:
				Form.errors['spcode'] =  ["not unique"]
	else:
		Form = SpeciesForm(instance=SpeciesInstance)
	return render_to_response('add.html',{'Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddSpecies")})