<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "java.io.*, java.sql.*" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JDBC Select Query</title>
</head>
<body>
<h2>JDBC Select Query Demonstration</h2>

	<%! Connection con=null; 
	Statement stmt=null; 
	ResultSet rs=null; 
	String userid = "root";
	String password = "";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String database = "empDB";
	%>
	<%
	  try{
			String query = "select * from employee";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connectionUrl+database, userid,password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
	%>
		<table border = "1" >
		<tr>
			<th>Employee ID</th><th>First Name</th><th>Last Name</th><th>Salary</th>
		</tr>		
	<%
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+ rs.getInt(4)+"</td>");
				out.println("</tr>");
			}
	  	}
		catch(Exception e)
		{
			out.println(e);
		}
		finally
		{
			if(stmt!=null)
			stmt.close();
			
			if(con!=null)
			con.close();
			
			if(rs!=null)
			rs.close();
		
		}
	
	%>
		</table>
	
</body>
</html>