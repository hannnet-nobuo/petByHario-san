<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>商品登録</title>
<s:head />
</head>
<body>
	<p>商品登録</p>
	<p><s:text name="msg" /></p>
	<s:form action="PetItemNew">
		
		<s:textfield label="商品コード" name="itemCd" />
		<s:textfield label="商品名" name="itemName" />
		<s:textfield label="商品属性" name="itemAttribute" />
		<s:textfield label="原価" name="itemCost" />
		<s:textfield label="売値" name="itemPrice" />
		<s:submit type="button" value="insert" name="insert" >登録</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetItemAdmin" />">戻る</a>
</body>
</html>
