<%-- 
    Document   : addition
    Created on : Apr 3, 2017, 10:54:26 PM
    Author     : Ravi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%@ page errorPage="divide_error.jsp" %>  
    <%  
      
    String num1=request.getParameter("n1");  
    String num2=request.getParameter("n2");  
      
    int a=Integer.parseInt(num1);  
    int b=Integer.parseInt(num2);  
    int ans=a/b;  
    out.print("division of numbers is: "+ans);  
      
    %>  
    </body>
</html>
