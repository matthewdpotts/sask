from django.conf.urls.defaults import *

urlpatterns = patterns('SASK2.DocumentRepository.views',
	url(r'^$', 'DocumentRepository', name='DocumentRepository'),
)
