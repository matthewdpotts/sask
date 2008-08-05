from django.conf.urls.defaults import *

urlpatterns = patterns('',
	url(r'^$', 'SASK2.database.views.home', name='Database'),	
	url(r'^Add/Species$', 'SASK2.species.views.Add', name='Database_Add_Species'),
	url(r'^Edit/Species$', 'SASK2.species.views.Edit', name='Database_Edit_Species')	
)
