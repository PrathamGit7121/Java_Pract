<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function Tags</title>
</head>
<body>
<h2>JSTL Function Tags Example 01</h2>
	  <br/>
 		Welcome to the world of ${fn:toUpperCase("jsp standard tag library!")}
      <c:set var = "string1" value = "This is first String."/>
      <c:set var = "string2" value = "${fn:split(string1, ' ')}" />
      <c:set var = "string3" value = "${fn:join(string2, '-')}" />
      <p>Length of String (1) : ${fn:length(string1)}</p>
	<p>Final String3 : ${string3}</p>

</body>

</html>