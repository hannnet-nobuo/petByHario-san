<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>社員編集</title>
<s:head />
</head>
<body>
	<p>社員編集</p>
	<s:form action="PersonelEdit">
		<s:textfield label="IDを入力" name="id" readonly="true"/>
		<s:textfield label="名前を入力" name="name" />
		<s:textfield label="メモを入力" name="memo" />
		<s:submit type="button" value="update" name="update" >確定</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PersonelSearch" />">検索に戻る</a>
</body>
</html>
