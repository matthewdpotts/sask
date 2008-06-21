from django.conf.urls.defaults import *

from SASK2.plots.models import *
from SASK2.trees.models import *
from SASK2.species.models import *

urlpatterns = patterns('SASK2.data.views',
	url(r'^$', 'home', name='DataHome'),
	url(r'^ExportPlotData$', 'ExportPlotData', name='ExportPlotData'),
	url(r'^ExportTreeData$', 'ExportTreeData', name='ExportTreeData'),
	url(r'^export/plots$' ,'export', name='ExportPlots', kwargs={'model':Plot}),
	url(r'^export/subplots$', 'export', name='ExportSubplot', kwargs={'model':Subplot}),
	url(r'^export/quadrates$', 'export', name='ExportQuadrate', kwargs={'model':Quadrate}),
	url(r'^export/plotsurveys$', 'export', name='ExportPlotSurvey', kwargs={'model':PlotSurvey}),
	url(r'^export/subplotsurveys$', 'export', name='ExportSubplotSurvey', kwargs={'model':SubplotSurvey}),
	url(r'^export/quadratesurveys$', 'export', name='ExportQuadrateSurvey', kwargs={'model':QuadrateSurvey}),
	url(r'^export/species$', 'export', name='ExportSpecies', kwargs={'model':Species}),
	url(r'^export/trees$', 'export', name='ExportTrees', kwargs={'model':Tree}),
	url(r'^export/treesurveys$', 'export', name='ExportTreeSurvey', kwargs={'model':TreeSurvey}),
)
