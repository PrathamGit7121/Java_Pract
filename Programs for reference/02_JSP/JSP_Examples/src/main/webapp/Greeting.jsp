<html>
    <head><title> Greeting </title></head>
	<body>
		<%@ page language = "java" import = "java.util.*" %>
		
		<% Calendar cal = Calendar.getInstance();  %>
                
                <%  	String name=request.getParameter("userName");
                
                       int h = cal.get(Calendar.HOUR_OF_DAY);
                        
                
			if(h>0 && h<12)
				out.println("<b>Good Morning "+name+" !!</b>");
			else if(h>=12 && h<15)
				out.println("<b>Good Afternoon "+name+" !!</b>");
			else if(h>=15 && h<19)
				out.println("<b>Good Evening "+name+" !!</b>");
			else
				out.println("<b>Good Night "+name+" !!</b>");
		%>
	</body>
</html>