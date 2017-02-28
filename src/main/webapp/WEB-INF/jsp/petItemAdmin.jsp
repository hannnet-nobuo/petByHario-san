<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>商品管理</title>
<s:head />
</head>
<body>
	<p>商品管理</p>
	<s:form action="PetItemAdmin" theme="simple">
		<s:textfield label="IDを入力" name="s_id" />
		<s:submit />
		<table>
			<tr>
				<th>商品コード</th>
				<th>商品属性</th>
				<th>商品名</th>
			</tr>
		  	<s:iterator value="items"> 
				<tr>
					<td>
						<a href="<s:url namespace="/" action="PetItemEdit" ><s:param name="editid" ><s:property value="itemId" /></s:param></s:url>" ><s:property value="itemId" /></a>
					</td>
					
					<td><s:property value="itemName" /></td>
					
					
				</tr>
			</s:iterator> 
		</table>
	</s:form>
	<p><a href="<s:url namespace="/" action="PetMain" ></s:url>" >メニューに戻る</a></p>
	<p><a href="<s:url namespace="/" action="PetItemNew" ></s:url>" >新規作成</a></p>
</body>
</html>
