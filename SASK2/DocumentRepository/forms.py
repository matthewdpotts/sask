from SASK2.DocumentRepository.models import *
from django import forms
from forms import models

class DocumentForm(forms.ModelForm):
	
	class Meta:
		model=Document

class DocumentFilterForm(forms.ModelForm):
	
	class Meta:
		model=Document
		exclude=('document',)
