from SASK2.species.models import Species
from django import newforms as forms

class SpeciesForm(forms.ModelForm):
	
	class Meta:
		model=Species

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
			qs = qs.filter(family__startswith=family)
		if genus:
			qs = qs.filter(genus__startswith=genus)
		if species:
			qs = qs.filter(species__startswith=species)
		if spcode:
			qs = qs.filter(spcode__startswith=spcode)
		qs = qs.distinct()
		self.fields['species'].queryset = qs

	species = forms.ModelChoiceField(Species.objects.all())
