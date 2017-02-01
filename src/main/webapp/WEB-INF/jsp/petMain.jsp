<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>メインメニュー</title>
<s:head />
</head>
<body>
	<p>メインメニュー</p>
	<s:form action="PetMain" theme="simple"></s:form>
		
		<p><a href="<s:url namespace="/" action="PetCustomerAdmin" ></s:url>" >顧客管理</a></p>
		<p><a href="<s:url namespace="/" action="PersonelNew" ></s:url>" >ペット用品管理</a></p>
		<p><a href="<s:url namespace="/" action="PersonelNew" ></s:url>" >ホテル利用</a></p>
		<p><a href="<s:url namespace="/" action="PetUserAdmin" ></s:url>" >ユーザー管理</a></p>
		
		
</body>
</html>
