<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate User</title>
</head>
<body>
	<%! String uname=null; String pwd=null; %>
       
    <% 
    	uname=request.getParameter("name");
    	pwd=request.getParameter("password");
        if(uname.equals("admin")&& pwd.equals("admin123")) {
        	config.getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else {
            config.getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
            out.print("Invalid Login!!! Please re-enter!!!");  
          } 
    %>
</body>
</html>