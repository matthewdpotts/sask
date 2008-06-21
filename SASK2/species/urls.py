from django.conf.urls.defaults import *

urlpatterns = patterns('SASK2.species.views',
	url(r'^$', 'Home', name='SpeciesHome'),
	url(r'^add$', 'AddSpecies', name='AddSpecies'),
	url(r'^GetSpeciesForm$', 'GetSpeciesForm', name='GetSpeciesForm'),
	url(r'^edit/species/$', 'EditSpecies', name='EditSpecies'),
	url(r'^edit/EditSpeciesForm/(?P<SpeciesID>[0-9]+)$', 'EditSpeciesForm', name='EditSpeciesForm'),
	url(r'^edit/SpeciesSelectorForm$', 'SpeciesSelectorForm', name='SpeciesSelectorForm'),

)
