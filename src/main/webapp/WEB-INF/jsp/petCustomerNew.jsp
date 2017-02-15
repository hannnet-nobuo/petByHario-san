<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>顧客登録</title>
<s:head />
</head>
<body>
	<p>顧客登録</p>
	<p><s:text name="msg" /></p>
	<s:form action="PetCustomerNew">
		
		<s:textfield label="顧客名" name="userName" />
		<s:textfield label="パスワード" name="userPass" />
		<s:submit type="button" value="insert" name="insert" >登録</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetCustomerAdmin" />">戻る</a>
</body>
</html>
