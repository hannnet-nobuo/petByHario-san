<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>ユーザー管理</title>
<s:head />
</head>
<body>
	<p>ユーザー管理</p>
	<s:form action="PetUserAdmin" theme="simple">
		<s:textfield label="IDを入力" name="s_id" />
		<s:submit />
		<table>
			<tr>
				<th>ユーザーid</th>
				<th>ユーザー名</th>
			</tr>
		  	<s:iterator value="users"> 
				<tr>
					<td>
						<a href="<s:url namespace="/" action="PetUserEdit" ><s:param name="editid" ><s:property value="userId" /></s:param></s:url>" ><s:property value="userId" /></a>
					</td>
					
					<td><s:property value="userName" /></td>
					
					
				</tr>
			</s:iterator> 
		</table>
	</s:form>
	<p><a href="<s:url namespace="/" action="PetMain" ></s:url>" >メニューに戻る</a></p>
	<p><a href="<s:url namespace="/" action="PetUserNew" ></s:url>" >新規作成</a></p>
</body>
</html>
