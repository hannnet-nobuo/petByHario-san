<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>ユーザー登録</title>
<s:head />
</head>
<body>
	<p>ユーザー登録</p>
	<p><s:text name="msg" /></p>
	<s:form action="PetUserNew">
		
		<s:textfield label="ユーザー名" name="userName" />
		<s:textfield label="パスワード" name="userPass" />
		<s:submit type="button" value="insert" name="insert" >登録</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetUserAdmin" />">戻る</a>
</body>
</html>
