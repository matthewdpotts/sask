from SASK2.personnel.models import *
from django import newforms as forms
from django.newforms import models

class PersonForm(forms.ModelForm):
	
	class Meta:
		model=Person

class PersonSelector(forms.Form):
	person = forms.ModelChoiceField(Person.objects.all())
