from django.contrib import admin
from SASK2.physical.models import *

class PlotAdmin(admin.ModelAdmin):
	pass

class SubplotAdmin(admin.ModelAdmin):
	pass

class QuadrateAdmin(admin.ModelAdmin):
	pass

class CompartmentAdmin(admin.ModelAdmin):
	pass

class SiteAdmin(admin.ModelAdmin):
	pass
	
class TransectAdmin(admin.ModelAdmin):
	pass

class ForestReserveAdmin(admin.ModelAdmin):
	pass
	
class StationAdmin(admin.ModelAdmin):
	pass
	
class ForestReserveSurveyAdmin(admin.ModelAdmin):
	pass
	
class SiteSurveyAdmin(admin.ModelAdmin):
	pass
	
class CompartmentSurveyAdmin(admin.ModelAdmin):
	pass
	
class PlotSurveyAdmin(admin.ModelAdmin):
	pass
	
class SubplotSurveyAdmin(admin.ModelAdmin):
	pass
	
class QuadrateSurveyAdmin(admin.ModelAdmin):
	pass
	

admin.site.register(Plot, PlotAdmin)
admin.site.register(Subplot, SubplotAdmin)
admin.site.register(Quadrate, QuadrateAdmin)
admin.site.register(Compartment, CompartmentAdmin)
admin.site.register(Site, SiteAdmin)
admin.site.register(Transect, TransectAdmin)
admin.site.register(ForestReserve, ForestReserveAdmin)
admin.site.register(Station, StationAdmin)
admin.site.register(ForestReserveSurvey, ForestReserveSurveyAdmin)
admin.site.register(SiteSurvey, SiteSurveyAdmin)
admin.site.register(CompartmentSurvey, CompartmentSurveyAdmin)
admin.site.register(PlotSurvey, PlotSurveyAdmin)
admin.site.register(SubplotSurvey, SubplotSurveyAdmin)
admin.site.register(QuadrateSurvey, QuadrateSurveyAdmin)
