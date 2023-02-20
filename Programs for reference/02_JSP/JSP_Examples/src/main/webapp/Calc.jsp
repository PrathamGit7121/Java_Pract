<%-- 
    Document   : Calc
    Created on : Apr 14, 2016, 4:00:39 PM
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
        <%@ page language="java" %>
        <% int a = Integer.parseInt(request.getParameter("num1"));
          int b = Integer.parseInt(request.getParameter("num2"));
          String operation = request.getParameter("op");
          int result = 0;
          
          if(operation.equals("Add"))
           { result = a + b; }
          else if(operation.equals("Sub"))
           { result = a - b; }
          else if(operation.equals("Multi"))
           { result = a * b; }
          else
           { result = a / b; }
          
          out.print("Result of " + a + operation + b + " = " + result);
         %>            
        
    </body>
</html>
