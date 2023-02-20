<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Management URL Rewriting</title>
</head>
<body>
		<h2>Session Management URL Rewriting</h2>
		<%! int count = 1; %> 
		<%
			String param = request.getParameter("count");
			if(param != null)
				count = Integer.parseInt(param);
			out.println("You have visited this page "+count+" time(s)");
		%>
		<a href = "UrlSessionDemo.jsp?count=<%= count+1 %>">Hit again</a>

</body>
</html>