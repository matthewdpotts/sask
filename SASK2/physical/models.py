from django.contrib.gis.db.models import * 

class ForestReserve(Model):
	
	Name = CharField(max_length=256, null=False, blank=False, unique=True)
	
	Polygon = PolygonField(null=True)

	objects = GeoManager()

	def __unicode__(self):
		return '%s' % (self.Name)
	
	class Admin:
		pass

class Compartment(Model):
	
	forestreserve = ForeignKey(ForestReserve)

	Name = CharField(max_length=256, null=True, blank=True)
	Number = CharField(max_length = 128, null=False, blank=False, unique=True)
	
	Polygon = PolygonField(null=True)

	objects = GeoManager()
	
	def __unicode__(self):
		return '%s' % (self.Number)

class Site(Model):
	
	compartment = ForeignKey(Compartment)
	
	Number = CharField(max_length = 128, null=False, blank=False, unique=True)
	
	Polygon = PolygonField(null=True)

	objects = GeoManager()
	
	def __unicode__(self):
		return '%s' % (self.Number)

class Transect(Model):
	
	site = ForeignKey(Site)

	Number = CharField(max_length = 128, null=False, blank=False, unique=True)
	
	Line = LineStringField(null=True)

	objects = GeoManager() 

	def __unicode__(self):
		return '%s' % (self.Number)

class Station(Model):

	transect = ForeignKey(Transect)

	Point = PointField(null = True)

	objects = GeoManager()

class Plot(Model):
	
	site = ForeignKey(Site)

	Number = CharField(max_length = 128, null=False, blank=False, unique=True)
	
	Polygon = PolygonField(null=True)

	objects = GeoManager()

	def __unicode__(self):
		return '%s' % (self.Number)

class Subplot(Model):
	
	plot = ForeignKey(Plot)
	
	Number = CharField(max_length = 128, null=False, blank=False, unique=True)
	
	Polygon = PolygonField(null=True)

	objects = GeoManager()

	def __unicode__(self):
		return '%s' % (self.Number)
	
class Quadrate(Model):
	
	subplot = ForeignKey(Subplot)

	Number = CharField(max_length = 128, null=False, blank=False, unique=True)

	Polygon = PolygonField(null=True)
	
	objects = GeoManager()

	def __unicode__(self):
		return '%s' % (self.Number)

class ForestReserveSurvey(Model):
	
	forestreserve = ForeignKey(ForestReserve)
	
	Date = DateField(null=True)	

class CompartmentSurvey(Model):
	
	compartment = ForeignKey(Compartment)

	Date = DateField(null=True)	

class SiteSurvey(Model):
	
	site = ForeignKey(Site)
	
	Date = DateField(null=True)

class PlotSurvey(Model):

	plot = ForeignKey(Plot)

	Date = DateField(null=True)

class SubplotSurvey(Model):

	subplot = ForeignKey(Subplot)

	Date = DateField(null=True)

class QuadrateSurvey(Model):

	quadrate = ForeignKey(Quadrate)

	Date = DateField(null=True)
