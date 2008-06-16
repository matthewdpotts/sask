from django.shortcuts import render_to_response
from SASK2.trees.models import Tree, TreeSurvey
from SASK2.trees.forms import TreeForm, TreeSurveyForm
from django.core.urlresolvers import reverse

def GetNewTreeSurveyForm(request):
	Message = ''
	if request.method == 'POST':
		treeform = TreeForm(data = request.POST)
		unlinkedtreesurveyform = UnlinkedTreeSurveyForm(data = request.POST)
		if treeform.is_valid() and unlinkedtreesurveyform.is_valid():
			tree = treeform.save()
			treesurvey = unlinkedtreesurveyform.save(commit = False)
			treesurvey.tree = tree
			treesurvey.save()
			return render_to_response('trees/NewTreeSurveyForm.html',{'Tree':tree,'TreeSurvey':TreeSurvey})
		else:
			Message += 'Please check the data for errors.'
			return render_to_response('trees/NewTreeSurveyForm.html',{'TreeForm':treeform,'TreeSurveyForm':unlinkedtreesurveyform,'Message':Message})
	else:
		treeform = TreeForm()
		unlinkedtreesurveyform = UnlinkedTreeSurveyForm()
		return render_to_response('trees/NewTreeSurveyForm.html',{'TreeForm':treeform,'TreeSurveyForm':unlinkedtreesurveyform})

def NewTreeSurvey(request):
	return render_to_response('trees/NewTreeSurvey.html')
