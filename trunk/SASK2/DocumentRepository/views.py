from django.template import RequestContext
from django.shortcuts import render_to_response
from SASK2.DocumentRepository.forms import *
def DocumentRepository(request):

	Message = ''

	documentfilterform = DocumentFilterForm()

	if request.method == 'POST':
		results = Document.objects.all()
		documentform = DocumentForm(request.POST, request.FILES)
		if documentform.is_valid():
			documentform.save()
			Message += "The document has been successfully saved."
			documentform = DocumentForm()
		else:
			Message += 'There were errors saving the document.'

	elif request.method == 'GET':
		
		documentform = DocumentForm()
		
		title = request.GET.get('title','')
		author = request.GET.get('author','')
		results = Document.objects.filter(title__icontains = title, author__icontains = author)
		

	else:
		documentform = DocumentForm()
		results = Document.objects.all()

	return render_to_response(
		'DocumentRepository/DocumentRepository.html',
		{'documentform':documentform,'Message':Message, 'results':results, 'documentfilterform':documentfilterform},
		context_instance=RequestContext(request),
		)
