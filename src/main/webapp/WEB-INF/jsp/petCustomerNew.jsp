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
		
		<s:textfield label="顧客名" name="customerName" />
		<s:textfield label="顧客名かな" name="customerKana" />
		<s:textfield label="郵便番号" name="postCd" />
		<s:textfield label="住所１" name="address1" />
		<s:textfield label="住所２" name="address2" />
		<s:textfield label="住所３" name="address3" />
		<s:textfield label="住所４" name="address4" />
		<s:textfield label="電話番号" name="tel" />
		<s:textfield label="EMAIL" name="email" />
		<s:textfield label="生年月日" name="birthYmd" />
		<s:submit type="button" value="insert" name="insert" >登録</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetCustomerAdmin" />">戻る</a>
</body>
</html>
