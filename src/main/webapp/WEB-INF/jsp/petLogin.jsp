<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>ログイン</title>
<s:head />
</head>
<body>
	<p>ログイン</p>
	<p><s:text name="msg" /></p>
	<s:form action="PetLogin">
		<s:textfield label="ユーザーID" name="userId" />
		<s:textfield label="パスワード" name="userPass" />
		<s:submit type="button" value="login" name="login" >ログイン</s:submit>
	</s:form>
		
		
</body>
</html>