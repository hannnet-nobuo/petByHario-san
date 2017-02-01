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
	<s:form action="PersonelEdit">
		<s:textfield label="ユーザーID" name="id" readonly="true"/>
		<s:textfield label="ユーザー名" name="name" />
		<s:textfield label="パスワード" name="memo" />
		<s:submit type="button" value="update" name="update" >確定</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PersonelSearch" />">検索に戻る</a>
</body>
</html>
