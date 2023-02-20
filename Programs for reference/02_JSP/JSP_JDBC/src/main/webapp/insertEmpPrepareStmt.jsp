<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>JDBC Insert Query Demonstration use Prepared Statement Interface</h2>

	<%! Connection con=null; 
	PreparedStatement stmt=null; 

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
		
			String query = "INSERT INTO employee(ID,first_name,last_name,salary)values(?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver"); //load the driver
			con = DriverManager.getConnection(connectionUrl+database, userid,password); //get connection with database
			
			stmt = con.prepareStatement(query); //get reference to prepare statement and pass the sql query
			
			//set the values to placeholders in query
			stmt.setInt(1,emp_ID); 
			stmt.setString(2,first_name);
			stmt.setString(3,last_name);
			stmt.setInt(4,emp_salary);
			
			int i=stmt.executeUpdate(); //execute the query
	        if(i!=0)
	        	{out.println("Record inserted successfully!");}
	        else
	        	{ out.println("Record not inserted!");}
		}
	    catch(Exception e)
	    {
	        out.print(e);
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