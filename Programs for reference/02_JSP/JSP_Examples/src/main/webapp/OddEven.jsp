<%-- 
    Document   : OddEven
    Created on : Apr 5, 2017, 10:24:47 PM
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
       <%-- Checking whether entered Number  is odd or even. --%>
       <%! boolean result=false;
          int number;
         public boolean oddEven(int n)
           {
             if(n%2==0)
                {result= true;}
             return result;
           } %>
           
           
           <% 
           int number = Integer.parseInt(request.getParameter("num"));
           
                 oddEven(number);     
           if(result==true)
              {out.println(number +" is even number");}
           else
              {out.println(number +" is odd number");}
           
          result=false;
            %>
            
    </body>
</html>
 