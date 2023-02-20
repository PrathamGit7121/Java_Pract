<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    	String name=request.getParameter("uname");
    	if(name !=null)
    	{
    		out.print("Welcome "+name);
    	}
    	else
    	{	
    		out.print("Please enter name!");
    		response.sendRedirect("index.jsp");
    	}
    %> 
    
    <Table>
    <tr>
    	<td>Enter your name :</td>
    	<td><input type="text" name="uname"/></td>
    </tr>
    	<tr><td><input type="submit" value="Go"/> </td></tr>
    </Table>
    </form>
   
</body>
</html>