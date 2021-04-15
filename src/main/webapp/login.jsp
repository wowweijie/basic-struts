<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>LOGIN!</title>
    <s:head/>
</head>
<body>
<!-- Login form that redirects to loginProcess action once submitted -->
<h1>Login</h1>
<s:form action="login">
    <s:textfield label="Username" name="accountBean.username" align="center"/>
    <s:password label="Password" name="accountBean.password" align="center"/>
    <s:submit align="center"/>
</s:form>

<!-- Action error that only appears if user credentials are wrong. -->
<s:actionerror style="color: red"/>

</body>
</html>