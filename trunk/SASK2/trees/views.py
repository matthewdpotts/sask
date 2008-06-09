from django.shortcuts import render_to_response
from models import Tree, TreeSurvey
from forms import TreeForm, TreeSurveyForm
from django.core.urlresolvers import reverse

def Home(request):
 		return render_to_response('trees/home.html')

def AddTree(request):
	Title = "Add Tree"
	PageTitle = Title
	ButtonLabel = "add tree"
	Message = ""
	TreeInstance = Tree()
	if request.POST:
		Form = TreeForm(data = request.POST, instance = TreeInstance)
		Matches = Tree.objects.filter(tag = Form.data['tag'])
		if Form.is_valid() and len(Matches)==0:
			SavedTree = Form.save()
			Message = "Tree successfully added (%s)." % SavedTree
			Form = TreeForm()
		else:
			Message = "There is an error in the form."
			if len(Matches) > 0:
				Form.errors['tag'] =  ["not unique"]
	else:
		Form = TreeForm(instance=TreeInstance)
	return render_to_response('add.html',{'Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddTree")})

def AddTreeSurvey(request):
	Title = "Add Tree Survey"
	PageTitle = Title
	ButtonLabel = "submit tree survey"
	Message = ""
	TreeSurveyInstance = TreeSurvey()
	if request.POST:
		Form = TreeSurveyForm(data = request.POST, instance = TreeSurveyInstance)
		if Form.is_valid():
			SavedTreeSurvey = Form.save()
			Message = "Tree survey successfully added (%s)." % SavedTreeSurvey
			Form = TreeSurveyForm()
		else:
			Message = "There is an error in the form."
	else:
		Form = TreeSurveyForm(instance=TreeSurveyInstance)
	return render_to_response('add.html',{'Form':Form, 'Message':Message,'Title':Title,'PageTitle':PageTitle,'ButtonLabel':ButtonLabel,'url':reverse("AddTreeSurvey")})