<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hidden Field Demo Page2</title>
</head>
<body>
<h2>Session Management using Hidden Form Field</h2><font size = 4>
<%  
    String name = request.getParameter("user_name");
	out.println("Welcome " + name);
	
	%></font>
</body>
</html>