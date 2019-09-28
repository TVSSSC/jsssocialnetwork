<%@page import="service.UserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>vyom</title>
</head>
<body>
<!-- 	create object of user when this jsp executes
 -->
 	<jsp:useBean id="u" class="beans.User"></jsp:useBean>

<!-- 	store the data of HTML form inside object of bean class when
	submit botton is pressed
 -->
	<jsp:setProperty property="*" name="u"/>
	
	<%
		UserService.saveUserInDB(u);
	%> 	
	<a href="../index.html">goto home page, user saved</a>
</body>
</html>