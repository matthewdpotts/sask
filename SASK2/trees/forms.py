from models import Tree, TreeSurvey
from django import newforms as forms

class TreeForm(forms.ModelForm):
	
	class Meta:
		model=Tree

class TreeSurveyForm(forms.ModelForm):
	
	class Meta:
		model=TreeSurvey