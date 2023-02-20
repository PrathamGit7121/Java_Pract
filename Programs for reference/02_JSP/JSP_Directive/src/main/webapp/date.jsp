<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date page</title>
</head>
<body >
<br/><h3 style="color:red"> Contents from date.jsp page</h3>
<h2 style="color:red">Today's date: <%= (new java.util.Date()).toString()%></h2>

</body>
</html>