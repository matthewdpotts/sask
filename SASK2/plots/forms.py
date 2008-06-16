from SASK2.plots.models import Plot, Subplot, Quadrate, PlotSurvey, SubplotSurvey, QuadrateSurvey
from django import newforms as forms
from django.newforms import models

class PlotForm(forms.ModelForm):
	
	class Meta:
		model=Plot

class SubplotForm(forms.ModelForm):
	
	class Meta:
		model=Subplot

class QuadrateForm(forms.ModelForm):
	
	class Meta:
		model=Quadrate

class PlotSurveyForm(forms.ModelForm):
	
	class Meta:
		model=PlotSurvey

class SubplotSurveyForm(forms.ModelForm):
	
	class Meta:
		model=SubplotSurvey

class QuadrateSurveyForm(forms.ModelForm):

	class Meta:
		model=QuadrateSurvey

class UnlinkedPlotSurveyForm(forms.ModelForm):
	
	class Meta:
		model=PlotSurvey
		exclude = ('plot',)
