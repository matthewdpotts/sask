from django.conf.urls.defaults import *

urlpatterns = patterns('SASK2.home.views',
	url(r'^$', 'home', name='Home'),
	url(r'^add$', 'Add', name='Add'),
	url(r'^edit$', 'Edit', name='Edit'),
	url(r'^export$', 'Export', name='Export'),
)
