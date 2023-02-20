<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Formatting Tags</title>
</head>
<body>
	<h2>JSTL Formatting Tags Example 01</h2>
	<h3>Number Parsing:</h3>
      <c:set var = "balance" value = "1250003.350" />
      <fmt:parseNumber  var = "i" type = "number" value = "${balance}" />
      <p>Parsed Number (1) : <c:out value = "${i}" /></p>
      <fmt:parseNumber  var = "i" integerOnly = "true" type = "number" value = "${balance}" />
      <p>Parsed Number (2) : <c:out value = "${i}" /></p>
</body>
</html>