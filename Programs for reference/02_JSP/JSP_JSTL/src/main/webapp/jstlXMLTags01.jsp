<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL XML Tags</title>
</head>
<body>
<h2>JSTL XML Tags Example 01</h2>
<h3>Books Info:</h3>
      <c:set var = "xmltext">
         <books>
            <book>
               <name>Advanced  JAVA</name>
               <author>RVK</author>
               <price>2700</price>
            </book>
           <book>
               <name>Blockchain</name>
               <author>RVK</author>
               <price>2500</price>
            </book>
            <book>
               <name>Data Structure</name>
               <author>RVK</author>
               <price>750</price>
            </book>
         </books>      
      </c:set>
      
	 <x:parse xml = "${xmltext}" var = "output"/>
      
      <ul class = "list">
         <x:forEach select = "$output/books/book/name" var = "item">
            <li>Book Name: <x:out select = "$item" /></li>
         </x:forEach>
      </ul>

</body>
</html>