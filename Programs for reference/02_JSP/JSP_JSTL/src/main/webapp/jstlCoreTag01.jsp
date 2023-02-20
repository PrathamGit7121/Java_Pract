<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core Tags 01</title>
</head>
<body>
<h2>Core Tags Example 01</h2>
<c:forEach var="i" begin="1" end="10">
   	Item <c:out value="${i}"/><p>
	</c:forEach>
</body>
</html>