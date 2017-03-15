<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>ユーザー編集</title>
<s:head />
</head>
<body>
	<p>ユーザー編集</p>
	<s:form action="PetUserEdit">
		<s:textfield label="ユーザーID" name="userId" readonly="true"/>
		<s:textfield label="ユーザー名" name="userName" />
		<s:textfield label="パスワード" name="userPass" />
		<s:submit type="button" value="userId" name="delid" >削除</s:submit>
		<s:submit type="button" value="update" name="update" >確定</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetUserAdmin" />">検索に戻る</a>
</body>
</html>
