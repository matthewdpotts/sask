from SASK2.plots.models import *
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
class PlotlessPlotSurveyForm(forms.ModelForm):
	plot = forms.ModelChoiceField(widget=forms.HiddenInput(),queryset=Plot.objects.all())
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

class PlotSelectorForm(forms.Form):
	plot = forms.ModelChoiceField(Plot.objects.all())

class PlotSurveySelectorForm(forms.Form):
	def __init__(self, *args, **kwargs):
		plot = kwargs['plot']
		del kwargs['plot']
		super(PlotSurveySelectorForm, self).__init__(*args, **kwargs)
		if plot:
			self.fields['plotsurvey'].queryset = PlotSurvey.objects.filter(plot = plot)
	plotsurvey = forms.ModelChoiceField(PlotSurvey.objects.all())
