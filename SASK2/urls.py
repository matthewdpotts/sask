from django.conf.urls.defaults import *
from SASK2 import settings

urlpatterns = patterns(
     '', 
    (r'^species/search/$', 'SASK2.species.views.search'), 
    (r'^species/add/$', 'SASK2.species.views.add'),      
    (r'^species/list/$', 'SASK2.species.views.list'),      
    #(r'^SASK/$', 'django.contrib.auth.views.login', {'template_name': 'login.html'} ),
    
                       
    # Uncomment this for admin:
    (r'^admin/', include('django.contrib.admin.urls')),
)
