from species.models import Species
from django import newforms as forms

class SpeciesForm(forms.ModelForm):
	
	class Meta:
		model=Species