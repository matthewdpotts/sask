from django.conf.urls.defaults import *

urlpatterns = patterns('SASK2.plots.views',
	url(r'^$', 'home', name='PlotsHome'),
	url(r'^add/plot$', 'AddPlot', name='AddPlot'),
	url(r'^add/plotsurvey$', 'AddPlotSurvey', name='AddPlotSurvey'),
	url(r'^edit/EditPlotSubmenu$', 'EditPlotSubmenu', name='EditPlotSubmenu'),
	url(r'^edit/plot/(?P<PlotID>[0-9]+)$', 'EditPlot', name='EditPlot'),
	url(r'^edit/plotsurvey/(?P<PlotSurveyID>[0-9]+)$', 'EditPlotSurvey', name='EditPlotSurvey'),
	
)
