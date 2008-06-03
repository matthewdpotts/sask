from django.db import models

class Person(models.Model):
	type_choices = (
		('L','local'),
		('F','foreign'),
	)
	first_name = models.CharField(max_length = 50)
	#middle_name = models.CharField(max_length = 50)
	last_name = models.CharField(max_length = 50)
	type = models.CharField(choices = type_choices, max_length = 1)

	def __str__(self):
        	return '%s %s' % (self.first_name, self.last_name)
	
	class Admin:
		pass
