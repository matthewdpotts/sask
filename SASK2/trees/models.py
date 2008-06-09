from django.db import models
from django.newforms import ModelForm
from django import newforms as forms

from plots.models import Plot
from plots.models import Subplot
from plots.models import Quadrate
from species.models import Species
from species.models import TreeSpecies
from personnel.models import Person

class Tree(models.Model):
	tag = models.PositiveIntegerField(unique=True)
	plot = models.ForeignKey(Plot)
	subplot = models.ForeignKey(Subplot)
	quadrate = models.ForeignKey(Quadrate)
	species = models.ForeignKey(Species)

	class Admin:
		pass;

        def __unicode__(self):
                return u'%s' % (self.tag)

        class Meta:
		pass

class TreeSurvey(models.Model):
	status_choices = (
		('A', 'alive'),
		('D', 'dead'),
		('U', 'unknown'),
	)
	tree = models.ForeignKey(Tree)
	dbh = models.DecimalField(max_digits = 5, decimal_places = 2)
	comments = models.TextField(blank=True)
	date = models.DateField()
	height = models.DecimalField(max_digits = 15, decimal_places = 5)
	canopy_width1 = models.DecimalField(max_digits = 15, decimal_places = 5)
	canopy_width2 = models.DecimalField(max_digits = 15, decimal_places = 5)
	measured_by = models.ForeignKey(Person, related_name="TreeSurvey_measured_by")
	tallied_by = models.ForeignKey(Person, related_name="TreeSurvey_tallied_by")
        def __unicode__(self):
                return u'%s %s' % (self.tree, self.date)
