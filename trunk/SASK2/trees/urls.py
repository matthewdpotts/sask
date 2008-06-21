from django.conf.urls.defaults import *

urlpatterns = patterns('SASK2.trees.views',
	url(r'^NewTreeSurvey$', 'NewTreeSurvey', name='NewTreeSurvey'),
	url(r'^GetTreeSurveyForm$', 'GetTreeSurveyForm', name='GetTreeSurveyForm'),
	url(r'^SecondTreeSurvey$', 'SecondTreeSurvey', name='SecondTreeSurvey'),
	url(r'^SubmitTreeSurveyForm$', 'SubmitTreeSurveyForm', name='SubmitTreeSurveyForm'), 
	url(r'^EditTreeSubmenu$', 'EditTreeSubmenu', name='EditTreeSubmenu'), 
	url(r'^edit/tree/(?P<TreeID>[0-9]+)$', 'EditTree', name='EditTree'),
        url(r'^edit/treesurvey/(?P<TreeSurveyID>[0-9]+)$', 'EditTreeSurvey', name='EditTreeSurvey'),

)
