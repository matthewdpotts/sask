from django.contrib.gis.db.models import *

from SASK2.physical.models import *
from SASK2.species.models import *
from SASK2.personnel.models import *

class Tree(Model):
	
	quadrate = models.ForeignKey(Quadrate, null=True)
	species = models.ForeignKey(Species, null=True)
	
	Tag = CharField(max_length=128, unique=True, null=True)
	
	Point = PointField(null=True)

	objects = GeoManager()
		
	class Admin:
		pass

        def __unicode__(self):
                return u'%s' % (self.tag)

class TreeSurvey(Model):

	StatusChoices = (
		('A', 'alive'),
		('D', 'dead'),
		('U', 'unknown'),
	)

	tree = ForeignKey(Tree)
	recorder = ForeignKey(Person, null=True, related_name='TreeSurvey_recorder')
	tagger = ForeignKey(Person, null=True, related_name='TreeuSurvey_tagger')

	StartDate = DateField()
	EndDate = DateField()
	DBH = DecimalField(max_digits = 5, decimal_places = 1, null = True)	
	Height = DecimalField(max_digits = 4, decimal_places = 1, null=True)
	Remark = CharField(max_length=256, null=True)
	Status = CharField(max_length=1, choices=StatusChoices, null=True)

	class Admin:
		pass

class BigTreePlotSurvey(models.Model):
	plot = models.ForeignKey(Plot)
	recorder = models.ForeignKey(Person, null=True, related_name='BigTreePlotSurvey_recorder')
	tagging = models.ForeignKey(Person, null=True, related_name='BigTreePlotSurvey_tagging')
	date = models.DateField()

class BigTreeSurvey(models.Model):
	quadrate = models.ForeignKey(Quadrate)
	tree_number = models.CharField(max_length=5, null=True)
	identification = models.CharField(max_length = 10, null=True)
	dbh = models.DecimalField(max_digits = 5, decimal_places = 1, null=True)
	height = models.DecimalField(max_digits=4, decimal_places = 1, null=True)
	remark = models.CharField(max_length=256, null=True)
	bigtreeplotsurvey = models.ForeignKey(BigTreePlotSurvey)	

class LittleTreePlotSurvey(models.Model):
	plot = models.ForeignKey(Plot)
	recorder = models.ForeignKey(Person, null=True, related_name='LittleTreePlotSurvey_recorder')
	tagging = models.ForeignKey(Person, null=True, related_name='LittleTreePlotSurvey_tagging')
	date = models.DateField()

class LittleTreeSurvey(models.Model):
	quadrate = models.ForeignKey(Quadrate)
	tree_number = models.CharField(max_length=5, null=True)
	identification = models.CharField(max_length = 10, null=True)
	dbh = models.DecimalField(max_digits = 5, decimal_places = 1, null=True)
	height = models.DecimalField(max_digits=4, decimal_places = 1, null=True)
	remark = models.CharField(max_length=256, null=True)
	littletreeplotsurvey = models.ForeignKey(LittleTreePlotSurvey)

class TreeSurvey(models.Model):
	status_choices = (
		('A', 'alive'),
		('D', 'dead'),
		('U', 'unknown'),
	)
	tree = models.ForeignKey(Tree)
	dbh = models.DecimalField(max_digits = 5, decimal_places = 2)
	comments = models.CharField(max_length=256, null=True, blank=True)
	date = models.DateField()
	height = models.DecimalField(max_digits = 15, decimal_places = 5)
	canopy_width1 = models.DecimalField(max_digits = 15, decimal_places = 5)
	canopy_width2 = models.DecimalField(max_digits = 15, decimal_places = 5)
	measured_by = models.ForeignKey(Person, related_name="TreeSurvey_measured_by")
	tallied_by = models.ForeignKey(Person, related_name="TreeSurvey_tallied_by")
        
	def __unicode__(self):
                return u'%s' % (self.date)

	class Meta:
		pass

class TreePlotSurvey(models.Model):
	plot = models.ForeignKey(Plot, null=True)
	recorder = models.ForeignKey(Person, null=True)
	date = models.DateField(null=True)
	
	def __unicode__(self):
		return u'%s (%s)' % (self.plot, self.date)

	class Meta:
		pass

class TreeQuadrateSurvey(models.Model):
	SHAPE_CHOICES = (
		('unknown', 'unknown'),
		('convex','convex'),
		('concave','concave'),
		)
	FINE_ROOT_CHOICES = (
		('0','---'),
		('A','none'),
		('B','some'),
		('C','lots'),
	)
	SOIL_SAMPLE_CHOICES = (
		('1','---'),
		('0','O.K.'),
	)
	treeplotsurvey = models.ForeignKey(TreePlotSurvey, null=True)
	shape = models.CharField(max_length = 7, choices = SHAPE_CHOICES, null = True, blank = True)
	fine_root = models.CharField(max_length = 1, choices = FINE_ROOT_CHOICES, null = True, blank = True)
	GRS = models.CharField(max_length = 5, null = True, blank=False)
	canopy_photo_number = models.IntegerField(null = True, blank=False)
	soil_sample = models.CharField(max_length = 1, choices = SOIL_SAMPLE_CHOICES, null = True, blank = True)
	quadrate = models.ForeignKey(Quadrate)
