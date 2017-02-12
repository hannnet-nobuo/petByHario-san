<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>顧客管理</title>
<s:head />
</head>
<body>
	<p>顧客管理</p>
	<s:form action="PetCustomerAdmin" theme="simple">
		<s:textfield label="IDを入力" name="s_id" />
		<s:submit />
		<table>
			<tr>
				<th>顧客id</th>
				<th>顧客名</th>
				<th>顧客名かな</th>
				<th>性別</th>
				<th>郵便番号</th>
				<th>住所１</th>
			</tr>
		  	<s:iterator value="customers"> 
				<tr>
					<td>
						<a href="<s:url namespace="/" action="PetCustomerEdit" ><s:param name="editid" ><s:property value="customerId" /></s:param></s:url>" ><s:property value="customerId" /></a>
					</td>
					
					<td><s:property value="customerName" /></td>
					<td><s:property value="customerKana" /></td>
					<td><s:property value="sex" /></td>
					<td><s:property value="postCd" /></td>
					<td><s:property value="address1" /></td>
					
					
				</tr>
			</s:iterator> 
		</table>
	</s:form>
	<p><a href="<s:url namespace="/" action="PetMain" ></s:url>" >メニューに戻る</a></p>
	<p><a href="<s:url namespace="/" action="PetCustomerNew" ></s:url>" >新規作成</a></p>
</body>
</html>
