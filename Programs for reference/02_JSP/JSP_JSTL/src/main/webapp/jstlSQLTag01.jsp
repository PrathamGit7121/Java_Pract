<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL SQL Tags</title>
</head>
<body>
<h2>JSTL SQL Tags Example 01</h2>
<h2>JSTL SQL Tags for SELECT and INSERT Operations</h2>
<c:catch var ="errormsg">

 <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/empDB"
     user="root"  password=""/>
     
<sql:update dataSource = "${snapshot}" var = "count"> INSERT INTO employee VALUES (111,'Ravindra', 'Kerkar',135000);  </sql:update>

<sql:query dataSource="${snapshot}" var="result"> SELECT * from employee; </sql:query>


<table border="1" >
<tr>
   <th>Emp ID</th>
   <th>First Name</th>
   <th>Last Name</th>
   <th>Age</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.id}"/></td>
   <td><c:out value="${row.first_name}"/></td>
   <td><c:out value="${row.last_name}"/></td>
   <td><c:out value="${row.salary}"/></td>
</tr>   </c:forEach> </table> 
</c:catch>

<c:if test = "${errormsg != null}">
  <p>There has been an exception raised in the above operation. Please fix the error.
  Exception is: ${errormsg}</p>
</c:if>
</body>
</html>