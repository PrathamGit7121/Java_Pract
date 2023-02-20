<%-- 
    Document   : httpSessionDemo
    Created on : Apr 14, 2016, 12:25:19 AM
    Author     : Ravi
--%>
<%@ page import="java.io.*,java.util.*" %>
<%
   // Get session creation time.
   Date createTime = new Date(session.getCreationTime());
   
   // Get last access time of this web page.
   Date lastAccessTime = new Date(session.getLastAccessedTime());

   String title = "Welcome Back to website";
   
   int visitCount = 1;
   
   String visitCountKey = new String("visitCount");
   
   String userIDKey = new String("userID");
   
   String userID = new String("RVK");

   // Check if this is new comer on your web page.
   if (session.isNew()){
      title = "Welcome to website";
      session.setAttribute(userIDKey, userID);
      session.setAttribute(visitCountKey,  visitCount);
   } 
   else
             {
   visitCount = (Integer)session.getAttribute(visitCountKey);
   
   
   visitCount = visitCount + 1; 
   session.setAttribute(visitCountKey,  visitCount);
        }
   
   userID = (String)session.getAttribute(userIDKey);
   
%>
<html>
<head>
<title>Session Tracking</title>
</head>
<body>

<h2>Session Tracking using HttpSession object</h2>
<%=title %>

<table border="1" > 
<tr bgcolor="#949494">
   <th>Session info</th>
   <th>Value</th>
</tr> 
<tr>
   <td>id</td>
   <td><% out.print( session.getId()); %></td>
</tr> 
<tr>
   <td>Creation Time</td>
   <td><% out.print(createTime); %></td>
</tr> 
<tr>
   <td>Time of Last Access</td>
   <td><% out.print(lastAccessTime); %></td>
</tr> 
<tr>
   <td>User ID</td>
   <td><% out.print(userID); %></td>
</tr> 
<tr>
   <td>Number of visits</td>
   <td><% out.print(visitCount); %></td>
</tr> 
</table> 
</body>
</html>
