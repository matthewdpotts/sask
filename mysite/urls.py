from django.conf.urls.defaults import *

urlpatterns = patterns('mysite.polls.views',
    (r'^polls/$', 'index'),
    (r'^polls/', include('mysite.polls.urls')),
    (r'^admin/', include('django.contrib.admin.urls')),
)
