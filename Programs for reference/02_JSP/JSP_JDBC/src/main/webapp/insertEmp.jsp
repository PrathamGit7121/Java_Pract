<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Emp Data</title>
</head>
<body>
<h2>JDBC Insert Query Demonstration use Statement Interface</h2>

	<%! Connection con=null; 
	Statement stmt=null; 

	String userid = "root";
	String password = "";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String database = "empDB";
	%>
	<%
		
		try
		{
			int emp_ID=Integer.parseInt(request.getParameter("empID"));
			String first_name=request.getParameter("fname");
			String last_name=request.getParameter("lname");
			int emp_salary=Integer.parseInt(request.getParameter("salary"));
		
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connectionUrl+database, userid,password);
			
			stmt = con.createStatement();
			
			int i=stmt.executeUpdate("INSERT INTO employee(ID,first_name,last_name,salary)values('"+emp_ID+"','"+first_name+"','"+last_name+"','"+emp_salary+"')");
	        if(i!=0)
	        	{out.println("Record inserted successfully!");}
	        else
	        	{ out.println("Record not inserted!");}
		}
	    catch(Exception e)
	    {
	        System.out.print(e);
	        e.printStackTrace();
	    }
		finally
		{
				if(stmt!=null)
				stmt.close();
				
				if(con!=null)
				con.close();
				
			
		}
			
	%>
	
	
</body>
</html>