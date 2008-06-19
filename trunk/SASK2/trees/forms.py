from SASK2.trees.models import Tree, TreeSurvey
from django import newforms as forms

class TreeForm(forms.ModelForm):
	
	class Meta:
		model=Tree

class TreeSurveyForm(forms.ModelForm):
	comments = forms.CharField(widget=forms.TextInput())
	tree = forms.ModelChoiceField(widget=forms.HiddenInput(),queryset=Tree.objects.all())
	dbh = forms.DecimalField(max_digits = 5, decimal_places = 2,widget=forms.TextInput(attrs={'size':'3'}))
	date = forms.DateField(widget=forms.TextInput(attrs={'size':'7'}))
	height = forms.DecimalField(max_digits = 15, decimal_places = 5,widget=forms.TextInput(attrs={'size':'3'}))
	canopy_width1 = forms.DecimalField(max_digits = 15, decimal_places = 5,widget=forms.TextInput(attrs={'size':'3'}))
	canopy_width2 = forms.DecimalField(max_digits = 15, decimal_places = 5,widget=forms.TextInput(attrs={'size':'3'}))
	class Meta:
		model=TreeSurvey

class UnlinkedTreeSurveyForm(forms.ModelForm):
	comments = forms.CharField(widget=forms.TextInput())	
	class Meta:
		model=TreeSurvey
		exclude = ('tree',)
