<%-- 
    Document   : cubeFunction
    Created on : Apr 6, 2017, 4:54:48 PM
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
        <%!   
            int cube(int n)
            {  
              return n*n*n;  
            }  
        %>  
        
        <%= "Cube of 3 is:"+cube(3) %>  
        
    </body>
</html>
