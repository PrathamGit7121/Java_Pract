<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>title>The include Action Example</title>
</head>
<body style="text-align: center">

         <h2>The include action Example</h2>
         <jsp:include page = "date.jsp" flush = "true" />

		<h2>Using JavaBeans in JSP</h2>
		
		<jsp:useBean id = "test" class = "action.TestBean" /> 	
		<jsp:setProperty name = "test" property = "message" value = "Hello JSP..." />
 			<p>Got message....</p> 
		<jsp:getProperty name = "test" property = "message" /> 
		

</body>
</html>