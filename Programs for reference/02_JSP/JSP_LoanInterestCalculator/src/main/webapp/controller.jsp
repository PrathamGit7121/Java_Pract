<html>
<body>
<%@ page language = "java" %>
<%@ page errorPage="Error.jsp" %>

    <%! String mode; %>
    <%
	mode = request.getParameter("mode");
		
	if(mode.equals("simple"))
	{
	%>	
	<jsp:forward page = "simple.jsp"/>
		
       <%
	}
	else if(mode.equals("compound"))
	{
	%>
	<jsp:forward page = "compound.jsp"/>
	
	<%
	  }
        else
          { 
	%>
        <jsp:include page = "index.jsp"/>
        <% out.print("Please select mode of interest!");
           } %>
               

</body>
</html>