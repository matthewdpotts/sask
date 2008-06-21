var Calendar = new CalendarPopup();
Calendar.showNavigationDropdowns();

function HttpPost(strURL, strSubmit, strResultFunc, args){
	strMethod = 'POST';
	HttpSend(strURL, strSubmit, strResultFunc, strMethod, args); 
}

function HttpGet(strURL, strSubmit, strResultFunc, args){
	strMethod = 'GET';
	HttpSend(strURL, strSubmit, strResultFunc, strMethod, args); 
}

function HttpSend(strURL, strSubmit, strResultFunc, strMethod, args){
	/*
	try {
		netscape.security.PrivilegeManager.enablePrivilege("UniversalBrowserRead");
	} catch (e) {
		alert("Permission UniversalBrowserRead denied.");
	}
	*/
	var xmlHttpReq = false;
	// Mozilla/Safari
	if (window.XMLHttpRequest) {
		xmlHttpReq = new XMLHttpRequest();
		xmlHttpReq.overrideMimeType('text/xml');
	}
	// IE
	else if (window.ActiveXObject) {
		xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlHttpReq.open(strMethod, strURL, true);
	xmlHttpReq.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	xmlHttpReq.onreadystatechange = function() {
		if (xmlHttpReq.readyState == 4) {
			eval(strResultFunc + '(xmlHttpReq.responseText,'+args+');');
		}
	}
	xmlHttpReq.send(strSubmit);
}

function GetFormAsPost(Form){
	var strSubmit = "";
	for (var i = 0; i < Form.elements.length; i++){
		formElem = Form.elements[i];
		switch (formElem.type) {
			// Text, select, hidden, password, textarea elements
			case 'text':
				strSubmit += formElem.name +
				'=' + escape(formElem.value) + '&';
				break;
			case 'select-one':
				strSubmit += formElem.name +
				'=' + escape(formElem.value) + '&';
				break;
			case 'select-multiple':
				for(var j = 0; j < formElem.length; j++){
					if(formElem[j].selected){
						strSubmit += formElem.name +
						'=' + escape(formElem[j].value) + '&';
					}
				}
				break;
			case 'hidden':
				strSubmit += formElem.name +
				'=' + escape(formElem.value) + '&';
				break;
			case 'password':
				break;
			case 'textarea':
				strSubmit += formElem.name +
				'=' + escape(formElem.value) + '&';
				break;
			break;
		}
	}
	return strSubmit;
}
