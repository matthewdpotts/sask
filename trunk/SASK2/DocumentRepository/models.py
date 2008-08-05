from django.db import models

# Create your models here.

class Document(models.Model):
	title = models.CharField(max_length=256)
	author = models.CharField(max_length=256)
	document = models.FileField(upload_to="DocumentRepository")

	def __unicode__(self):
		return self.get_document_url()
	
	class Admin:
		pass
