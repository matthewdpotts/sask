from django.conf.urls.defaults import *

urlpatterns = patterns('SASK2.plots.views',
	url(r'^$', 'home', name='PlotsHome'),
	url(r'^add/plot$', 'AddPlot', name='AddPlot'),
	url(r'^add/plotsurvey$', 'AddPlotSurvey', name='AddPlotSurvey'),
)
