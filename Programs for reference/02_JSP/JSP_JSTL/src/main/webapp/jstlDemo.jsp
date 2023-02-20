<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello <c:out value="${param.userName}" default="FAMT" />
 	 	
 	<br/> <br/>
 	<c:set var = "salary" scope = "session" value = "${param.mySalary}"/><br/>
    Salary is US $ <c:out value = "${salary}"/> Per month <br/> 
    Salary in indian Rs <c:out value = "${salary * 80 }"/> Per month <br/> <br/>
 	
 	<c:choose>
         <c:when test = "${salary >= 2500 && salary < 12500}">
            Salary is ok!
         </c:when>
         
         <c:when test = "${salary >=12500 && salary < 18000}">
            Salary is good.
         </c:when>
         
         <c:when test = "${salary >=18000 && salary < 25000}">
            Salary is very nice.
         </c:when>
         
          <c:when test = "${salary >=25000}">
            Salary is attractive.
         </c:when>
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
 	
 
 	<br>
 <!--  <c:import var="data" url="https://www.tutorialspoint.com/index.htm"/>  
	<c:out value="${data}"/> -->	
</body>
</html>