<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Login</title>
</head>
<body>
<h3>Simple Login Interface
</h3>

<s:form action="login">
    <s:textfield name="accountBean.username" label="Username" />
    <s:textfield name="accountBean.password" label="Password" />
    <s:submit/>
</s:form>
</body>
</html>