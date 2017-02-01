<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>ログイン</title>
<s:head />
</head>
<body>
	<p>ログイン</p>
	<p><s:text name="msg" /></p>
	<s:form action="PetLogin">
		User id　<input type="text" name="userId" /> <br/>
		Password<input type="password" name="userPass" /> <br />
		<input type="submit" value="Login"/>
	</s:form>
		
		
</body>
</html>