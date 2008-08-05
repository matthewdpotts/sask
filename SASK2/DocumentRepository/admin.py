from django.contrib import admin
from SASK2.DocumentRepository.models import *

class DocumentAdmin(admin.ModelAdmin):
	pass

admin.site.register(Document, DocumentAdmin)
