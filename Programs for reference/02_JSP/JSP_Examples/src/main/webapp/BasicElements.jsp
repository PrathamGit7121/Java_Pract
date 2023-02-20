<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Basic Element</title>
</head>
<body>
<%-- This JSP example demonstrate Basic JSP Elements scriplets, 
comments , expressions and Declaration --%>
	<%-- scriplet tag--%>
	<% out.println("Finding Factorial of Number </br>"); %>

	<%-- Declaration tag--%>
	<%! int num = 5;int fact=1; %>

	<%-- scriplet tag--%>
	<% 	if(num==0)
		{
			fact=1;
		}
		else
		{
			for(int i = 1; i<=num; i++)
			{
				fact = fact * i;
			}
		}
	
	 %>
	 
	 <%-- expressions tag --%>
	 <B>Factorial of <%=num %> = <%= fact %></B>

</body>
</html>