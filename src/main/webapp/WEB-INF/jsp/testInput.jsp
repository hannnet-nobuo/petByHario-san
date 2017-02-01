<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>入力テスト</title>
	<s:head />
</head>
<body>
<p>入力のテストです</p>
	<s:form action="testInput">
		<s:textfield label="id" name="id"/>
		<s:textfield label="name" name="name"/>
		<s:textfield label="memo" name="memo"/>
		<s:submit/>
	</s:form>
<table>
<tr><th>id</th><th>name</th><th>memo</th></tr>
<s:iterator value="myMappings">
  <tr>
  <td><s:property value="id" /></td>
  <td><s:property value="name" /></td>
  <td><s:property value="memo" /></td>
  </tr>
</s:iterator>
</table>
</body>
</html>