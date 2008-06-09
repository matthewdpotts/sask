from django.conf.urls.defaults import *
from SASK2 import settings
from SASK2.plots.models import Plot, Subplot, Quadrate, PlotSurvey, SubplotSurvey, QuadrateSurvey
from SASK2.species.models import Species
from SASK2.trees.models import Tree, TreeSurvey
urlpatterns = patterns(
	'',      
	#(r'^SASK/$', 'django.contrib.auth.views.login', {'template_name': 'login.html'} ),
	(r'^SASK_media/(?P<path>.*)$', 'django.views.static.serve', {'document_root': '/home/brice/djcode/SASK2/SASK_media'}),
	
	url(r'^$', 'SASK2.home.views.home', name="Home"), 

	url(r'^plots/$', 'SASK2.plots.views.home', name="PlotsHome"),
	url(r'^plots/getallplots$', 'SASK2.plots.views.GetAllPlots', name="GetAllPlots"),	   
	url(r'^plots/add/plot$', 'SASK2.plots.views.AddPlot', name="AddPlot"), 
	url(r'^plots/add/subplot$', 'SASK2.plots.views.AddSubplot', name="AddSubplot"), 
	url(r'^plots/add/quadrate$', 'SASK2.plots.views.AddQuadrate', name="AddQuadrate"),
	url(r'^plots/add/survey/plot$', 'SASK2.plots.views.AddPlotSurvey', name="AddPlotSurvey"), 
	url(r'^plots/add/survey/subplot$', 'SASK2.plots.views.AddSubplotSurvey', name="AddSubplotSurvey"), 
	url(r'^plots/add/survey/quadrate$', 'SASK2.plots.views.AddQuadrateSurvey', name="AddQuadrateSurvey"),    
	url(r'^plots/getsubplotsofplot$', 'SASK2.plots.views.GetSubplotsOfPlot', name="GetSubplotsOfPlot"),
	url(r'^plots/getquadratesofsubplot$', 'SASK2.plots.views.GetQuadratesOfSubplot', name="GetQuadratesOfSubplot"),
	
	url(r'^data$', 'SASK2.data.views.home', name="DataHome"),
	url(r'^data/export/plots$', 'SASK2.data.views.export', kwargs={'model':Plot}, name="ExportPlot"),
	url(r'^data/export/subplots$', 'SASK2.data.views.export', kwargs={'model':Subplot}, name="ExportSubplot"),
	url(r'^data/export/quadrates$', 'SASK2.data.views.export', kwargs={'model':Quadrate}, name="ExportQuadrate"),
	url(r'^data/export/plotsurveys$', 'SASK2.data.views.export', kwargs={'model':PlotSurvey}, name="ExportPlotSurvey"),
	url(r'^data/export/subplotsurveys$', 'SASK2.data.views.export', kwargs={'model':SubplotSurvey}, name="ExportSubplotSurvey"),
	url(r'^data/export/quadratesurveys$', 'SASK2.data.views.export', kwargs={'model':QuadrateSurvey}, name="ExportQuadrateSurvey"),
	url(r'^data/export/species$', 'SASK2.data.views.export', kwargs={'model':Species}, name="ExportSpecies"),
	url(r'^data/export/trees$', 'SASK2.data.views.export', kwargs={'model':Tree}, name="ExportTrees"),
	url(r'^data/export/treesurveys$', 'SASK2.data.views.export', kwargs={'model':TreeSurvey}, name="ExportTreeSurvey"),
	
	url(r'^species/$', 'SASK2.species.views.Home', name="SpeciesHome"), 
	url(r'^species/add$', 'SASK2.species.views.AddSpecies', name="AddSpecies"), 

	url(r'^trees/$', 'SASK2.trees.views.Home', name="TreesHome"), 
	url(r'^trees/add$', 'SASK2.trees.views.AddTree', name="AddTree"), 
	url(r'^trees/add/survey$', 'SASK2.trees.views.AddTreeSurvey', name="AddTreeSurvey"), 

	(r'^admin/', include('django.contrib.admin.urls')),
)
