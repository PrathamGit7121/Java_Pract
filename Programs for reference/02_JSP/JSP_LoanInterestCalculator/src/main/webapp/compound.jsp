<%-- 
    Document   : compund
    Created on : Apr 3, 2017, 11:55:24 PM
    Author     : Ravi
--%>
<html>
<body>
<%@ page language = "java" %>
<%@ page errorPage="Error.jsp" %>
<jsp:include page = "Header.jsp" flush = "true"/>
<%! double p,r, interest, i; 
int t; %>

<%
    p = Double.parseDouble(request.getParameter("principal"));
	r = Double.parseDouble(request.getParameter("rate"));
	t = Integer.parseInt(request.getParameter("period"));
	i= 1 + (r/100);
 	interest= p*Math.pow(i,t);
%>
<table align = "center">
	<tr>
		<td>Principal Amount : </td><td><%= p %></td>
	</tr>
	<tr>
		<td>   Interest Rate : </td><td><%= r %></td>
	</tr>
	<tr>
		<td>   Loan Period   : </td><td><%= t %></td>
	</tr>
        <tr>
		<td>Interest mode    : </td><td><%=request.getParameter("mode")%></td>
	</tr>
        <tr>
		<td><b>Interest Calculated    : </b></td><td><b><%=Math.round(interest) %></b></td>
	</tr>
</table>
<jsp:include page = "Footer.jsp" flush = "true"/>
</body>
</html>