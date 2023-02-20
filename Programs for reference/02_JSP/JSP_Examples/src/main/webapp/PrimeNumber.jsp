<html>
	<head>
		<title>Prime Number</title>
	</head>
	<body>
            <%@page language = "java" isThreadSafe="false" %>
	<%! boolean flag = true; %>
	<%="Prime numbers are : " %>
	<%
		for(int i=2;i<100;i++)
		{
			for(int j=2;j<(i-1);j++)
			{
				if(i%j == 0)		
				{
					flag = false;
					break;
				}				
			}
			if(flag == true)
			{
				out.println("<b>"+i+"</b>");
			}
			else
                        {	flag = true;     }
                        
                }		
	%>
	</body>
</html>