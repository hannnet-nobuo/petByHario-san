<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>商品編集</title>
<s:head />
</head>
<body>
	<p>商品編集</p>
	<s:form action="PetItemEdit">
		<s:textfield label="商品コード" name="itemCd" readonly="true"/>
		<s:textfield label="商品名" name="ItemName" />
		<s:textfield label="商品属性" name="ItemAttribute" />
		<s:submit type="button" value="delid" name="delid" >削除</s:submit>
		<s:submit type="button" value="update" name="update" >確定</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetItemAdmin" />">検索に戻る</a>
</body>
</html>
