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
	<s:form action="PetCustomerEdit">
		<s:textfield label="顧客ID" name="CustomerId" readonly="true"/>
		<s:textfield label="顧客名" name="CustomerName" />
		<s:textfield label="パスワード" name="userPass" />
		<s:submit type="button" value="%{id}" name="delid" >削除</s:submit>
		<s:submit type="button" value="update" name="update" >確定</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetUserAdmin" />">検索に戻る</a>
</body>
</html>
