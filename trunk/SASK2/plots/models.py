from django.db import models
from django.newforms import ModelForm
from django import newforms as forms
        
from SASK2.personnel.models import Person

class Plot(models.Model):
        SLOPE_POS= (
                ('RI', 'Ridge'),
                ('UP', 'Upper'),
                ('MI', 'Middle'),
                ('LO', 'Lower'),
                ('VA', 'Valley'),
        )
	latitude = models.DecimalField(max_digits=5,decimal_places=2)
	longitude = models.DecimalField(max_digits=10,decimal_places=5)
	baseline_bearing = models.DecimalField(max_digits=10, decimal_places=5)
	width = models.PositiveIntegerField()
	length = models.PositiveIntegerField()
	forest_reserve = models.CharField(max_length=20)
	compartment = models.PositiveIntegerField()
	"""
	altitude_NE = models.DecimalField(max_digits=10, decimal_places=5)
	altitude_SE = models.DecimalField(max_digits=10, decimal_places=5)
	altitude_SW = models.DecimalField(max_digits=10, decimal_places=5)
	altitude_NW = models.DecimalField(max_digits=10, decimal_places=5)
	"""

	def __unicode__(self):
                return u'%s %s %s' % (self.forest_reserve, self.latitude, self.longitude)

	class Admin:
		pass

class PlotSurvey(models.Model):
	date = models.DateField()
	plot = models.ForeignKey(Plot)
	measured_by = models.ForeignKey(Person, related_name = 'sitesurvey_measured_set')
	tallied_by = models.ForeignKey(Person, related_name = 'sitesurvey_tallied_set')
	liana_figs = models.CharField(max_length = 20)

	def __unicode__(self):
                return u'%s %s' % (self.plot, self.date)

	class Admin:
		pass

class Subplot(models.Model):
	plot = models.ForeignKey(Plot)
	number = models.PositiveIntegerField()

	def __unicode__(self):
                return u'%s' % (self.number)

	class Admin:
		pass

class SubplotSurvey(models.Model):
	subplot = models.ForeignKey(Subplot)
	date = models.DateField()
	photo = models.ImageField(upload_to='canopy_photos')
	spherical_density = models.PositiveIntegerField()
		
	def __unicode__(self):
                return u'%s %s' % (self.subplot, self.date)

	class Admin:
		pass

class Quadrate(models.Model):
	subplot = models.ForeignKey(Subplot)
	number = models.PositiveIntegerField();
	
	def __unicode__(self):
		return u'%s' % (self.number)

	class Admin:
		pass

class QuadrateSurvey(models.Model):
	quadrate = models.ForeignKey(Quadrate)
	date = models.DateField()
	convexity = models.DecimalField(max_digits=10, decimal_places=5)
	percent_unoccupied = models.DecimalField(max_digits=10, decimal_places=5)
	def __unicode__(self):
		return u'%s %s' % (self.quadrate, self.date)

	class Admin:
		pass
	