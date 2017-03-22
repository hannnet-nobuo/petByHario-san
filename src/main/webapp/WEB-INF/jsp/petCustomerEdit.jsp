<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>顧客編集</title>
<s:head />
</head>
<body>
	<p>顧客編集</p>
	<s:form action="PetCustomerEdit">
		<s:textfield label="顧客ID" name="customerId" readonly="true"/>
		<s:textfield label="顧客名" name="customerName" />
		<s:textfield label="顧客名かな" name="customerKana" />
		<s:select label="性別" headerKey="-1" headerValue="性別選択" list="#{'M':'男', 'F':'女'}" name="sex" />
		<s:textfield label="郵便番号" name="postCd" />
		<s:textfield label="住所１" name="address1" />
		<s:textfield label="住所２" name="address2" />
		<s:textfield label="住所３" name="address3" />
		<s:textfield label="住所４" name="address4" />
		<s:textfield label="電話番号" name="tel" />
		<s:textfield label="EMAIL" name="email" />
		<s:textfield label="生年月日" name="birthYmd" />
		<s:submit type="button" value="delete" name="delete" >削除</s:submit>
		<s:submit type="button" value="update" name="update" >確定</s:submit>
	</s:form>
	<a href="<s:url namespace="/" action="PetCustomerAdmin" />">検索に戻る</a>
</body>
</html>
