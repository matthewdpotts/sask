from SASK2.trees.models import * 
from SASK2.personnel.models import Person
from django import newforms as forms
from SASK2.plots.models import *

class TreePlotSurveyForm(forms.ModelForm):
	plot = forms.ModelChoiceField(Plot.objects.all(), widget=forms.HiddenInput())
	recorder = forms.ModelChoiceField(Person.objects.all(), required=False)
	date = forms.DateField(widget=forms.TextInput(attrs={'size':'10'}))
	class Meta:
		model=TreePlotSurvey

class TreeQuadrateSurveyForm(forms.ModelForm):
	treeplotsurvey = forms.ModelChoiceField(TreePlotSurvey.objects.all(), widget=forms.HiddenInput(), required=False)
	shape = forms.ChoiceField(choices = TreeQuadrateSurvey.SHAPE_CHOICES, required = False)
	fine_root = forms.ChoiceField(choices = TreeQuadrateSurvey.FINE_ROOT_CHOICES, required = False)
	GRS = forms.CharField(widget = forms.TextInput(attrs={'size':'5'}), required=False)
	canopy_photo_number = forms.CharField(widget = forms.TextInput(attrs={'size':'3'}), required = False)
	soil_sample = forms.ChoiceField(choices = TreeQuadrateSurvey.SOIL_SAMPLE_CHOICES, required = False)
	quadrate = forms.ModelChoiceField(Quadrate.objects.all(), widget=forms.HiddenInput())
	q = Quadrate()
	class Meta:
		model=TreeQuadrateSurvey
	
class BigTreePlotSurveyForm(forms.ModelForm):
	plot = forms.ModelChoiceField(Plot.objects.all(), widget=forms.HiddenInput())
	recorder = forms.ModelChoiceField(Person.objects.all(), required=False)
	tagging = forms.ModelChoiceField(Person.objects.all(), required=False)
	date = forms.CharField(widget=forms.TextInput(attrs={'size':'10'}))
	class Meta:
		model = BigTreePlotSurvey
		#exclude = ('birth_date',)

class BigTreeSurveyForm(forms.ModelForm):
	SUBPLOT_CHOICES = (
				('1','1'),
				('2','2'),
				('3','3'),
				('4','4'),
	)
	subplot = forms.ChoiceField(choices = SUBPLOT_CHOICES)
	tree_number = forms.CharField(widget=forms.TextInput(attrs={'size':'4'}), required=False)
	identification = forms.CharField(widget=forms.TextInput(attrs={'size':'10'}),required=False)
	dbh = forms.IntegerField(widget=forms.TextInput(attrs={'size':'3'}), required=False)
	height = forms.IntegerField(widget=forms.TextInput(attrs={'size':'3'}), required=False)
	remark = forms.CharField(widget=forms.TextInput(attrs={'size':'10'}), required=False) 
	class Meta:
		model = BigTreeSurvey
		exclude = ('bigtreeplotsurvey','quadrate')

class LittleTreePlotSurveyForm(forms.ModelForm):
	plot = forms.ModelChoiceField(Plot.objects.all(), widget=forms.HiddenInput())
	recorder = forms.ModelChoiceField(Person.objects.all(), required=False)
	tagging = forms.ModelChoiceField(Person.objects.all(), required=False)
	date = forms.CharField(widget=forms.TextInput(attrs={'size':'10'}))
	class Meta:
		model = LittleTreePlotSurvey

class LittleTreeSurveyForm(forms.ModelForm):
	SUBPLOT_CHOICES = (
				('1','1'),
				('2','2'),
				('3','3'),
				('4','4'),
	)
	QUADRATE_CHOICES = (
				('1','1'),
				('2','2'),
				('3','3'),
				('4','4'),
	)
	subplot = forms.ChoiceField(choices = SUBPLOT_CHOICES)
	q = forms.ChoiceField(choices = QUADRATE_CHOICES, required=False)
	tree_number = forms.CharField(widget=forms.TextInput(attrs={'size':'4'}), required=False)
	identification = forms.CharField(widget=forms.TextInput(attrs={'size':'10'}),required=False)
	dbh = forms.IntegerField(widget=forms.TextInput(attrs={'size':'3'}), required=False)
	height = forms.IntegerField(widget=forms.TextInput(attrs={'size':'3'}), required=False)
	remark = forms.CharField(widget=forms.TextInput(attrs={'size':'10'}), required=False) 
	class Meta:
		model = LittleTreeSurvey
		exclude = ('littletreeplotsurvey','quadrate')

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

class TreeSelectorForm(forms.Form):
	tree = forms.ModelChoiceField(Tree.objects.all())

class TreeSurveySelectorForm(forms.Form):
        def __init__(self, *args, **kwargs):
                tree = kwargs['tree']
                del kwargs['tree']
                super(TreeSurveySelectorForm, self).__init__(*args, **kwargs)
                if tree:
                        self.fields['treesurvey'].queryset = TreeSurvey.objects.filter(tree = tree)
        treesurvey = forms.ModelChoiceField(TreeSurvey.objects.all())

