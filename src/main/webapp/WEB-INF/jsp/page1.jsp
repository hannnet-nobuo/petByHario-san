<!DOCTYPE html PUBLIC
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"> 
<head>
	<title>page1</title>
	<s:head/>
</head>
<body>
	<s:form action="page2">
		<s:submit type="button" value="click" name="click" />
		<s:submit type="button" value="cancel" name="cancel" />
		<s:submit type="button" value="submit" name="submit" />
	</s:form>
</body>
</html>