<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hidden Field Demo Page1</title>
</head>
<body>
<h2>Session Management using Hidden Form Field</h2>
<form method = "post" action = "HiddenFieldDemo2.jsp">
  <font size = 4>Name is stored in hidden field.Click on submit button to view hidden field data.</font><br><br>
 <input type = "hidden" name = "user_name" value="Ravi">
 <br>
		<input type = "submit" name = "submit" value = "submit" >
</form>	
	
</body>
</html>