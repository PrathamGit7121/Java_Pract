<html>
<body>
<%@ page language = "java" %>
<%@ page errorPage="Error.jsp" %>
<jsp:include page = "Header.jsp" flush = "true"/>
<%! double p,r, interest; 
int t; %>

<%
        p = Double.parseDouble(request.getParameter("principal"));
	r = Double.parseDouble(request.getParameter("rate"));
	t = Integer.parseInt(request.getParameter("period"));
 	//interest= p*(1+ t*r/100);
 	interest =  p*(r/100)*(t/12);
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