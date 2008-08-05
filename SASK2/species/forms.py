from SASK2.species.models import Species
from django import forms

class SpeciesForm(forms.ModelForm):
	
	class Meta:
		model=Species

class SpeciesSelectorModelChoiceField(forms.ModelChoiceField):
	def label_from_instance(self, obj):
		return "%s %s %s (%s)" % (obj.family,obj.genus,obj.species,obj.spcode)
class SpeciesSelectorFormForm(forms.Form):
	def __init__(self, *args, **kwargs):
		family = kwargs.pop('family', False)
		genus = kwargs.pop('genus', False)
		species = kwargs.pop('species', False)
		spcode = kwargs.pop('spcode', False)
		#del kwargs['family']
		#del kwargs['genus']
		#del kwargs['species']
		#del kwargs['spcode']
		super(SpeciesSelectorFormForm, self).__init__(*args, **kwargs)
		qs = Species.objects.all()
		if family:
			qs = qs.filter(family__istartswith=family)
		if genus:
			qs = qs.filter(genus__istartswith=genus)
		if species:
			qs = qs.filter(species__istartswith=species)
		if spcode:
			qs = qs.filter(spcode__istartswith=spcode)
		qs = qs.distinct()
		self.fields['species'].queryset = qs

	species = SpeciesSelectorModelChoiceField(Species.objects.all())

