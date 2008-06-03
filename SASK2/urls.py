from django.conf.urls.defaults import *
from SASK2 import settings

urlpatterns = patterns(
     '', 
	(r'^admin/', include('django.contrib.admin.urls')),              
    (r'^SASK/$', 'django.contrib.auth.views.login', {'template_name': 'login.html'} ),
    (r'^SASK/home$', 'home.views.home' ),

    (r'^SASK/trees/$', 'trees.views.home' ),
    (r'^SASK/trees/add$', 'trees.views.add' ),
    (r'^SASK/trees/edit$', 'sites.views.edit' ),
    (r'^SASK/trees/export$', 'trees.views.export' ),

    (r'^SASK/sites/$', 'sites.views.home' ),
    (r'^SASK/sites/$', 'sites.views.home' ),
    (r'^SASK/trees/$', 'trees.views.home' ),
    (r'^SASK/sites/$', 'sites.views.home' ),
    (r'^SASK/trees/$', 'trees.views.home' ),
    (r'^SASK/sites/$', 'sites.views.home' ),
    (r'^trees/Enter/home/', 'trees.views.enter' ),
    (r'^trees/Enter/new/', 'trees.views.new'),
    (r'^trees/Enter/selectSite/', 'trees.views.selectSite'),
    (r'^trees/Enter/tree/(?P<recievedSite>.+)/', 'trees.views.treedata'),
    (r'^trees/Export/$', 'trees.views.selectSiteToExport' ),
    (r'^trees/Export/(?P<recievedSite>.+)/', 'trees.views.exportTreedata2'),
                       
    # Uncomment this for admin:
    (r'^admin/', include('django.contrib.admin.urls')),
)
