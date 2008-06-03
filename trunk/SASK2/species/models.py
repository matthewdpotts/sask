from django.db import models

class Species(models.Model):
	family = models.CharField(max_length=50)
	genus = models.CharField(max_length=50)
	species = models.CharField(max_length=50)
	spcode = models.CharField(max_length=50, unique=True)

	def __unicode__(self):
                return u'%s %s %s (%s)' % (self.family, self.genus, self.species, self.spcode)

	class Admin:
		pass

class TreeSpecies(models.Model):
	timber_group_types = (
		('LHW', 'light hard wood'),
		('MHW', 'medium hard wood'),
		('HHW', 'heavy hard wood'),
		('MISC','miscellaneous'),
		('U', 'unknown'),
	)
	timber_group = models.CharField(max_length = 4, choices = timber_group_types)
	commercial_code1 = models.CharField(max_length = 10)
	commercial_code2 = models.CharField(max_length = 10)
	species = models.ForeignKey(Species);

	def __unicode__(self):
                return u'%s %s %s %s' % (self.species, self.commercial_code1, self.commercial_code2, self.timber_group)

	class Admin:
		pass

