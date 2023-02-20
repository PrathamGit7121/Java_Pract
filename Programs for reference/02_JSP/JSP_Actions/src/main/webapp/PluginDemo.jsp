<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Plugin action Demo</title>
</head>
<body>
<div align="center">
        <jsp:plugin type="applet" code="action.MyApplet.class" codebase="/action" align="center">
             <jsp:params>
                <jsp:param name="firstName" value="Ravindra" />
                <jsp:param name="lastName" value="Kerkar" />
            </jsp:params>
             
            <jsp:fallback>
                <p>Could not load applet!</p>
            </jsp:fallback>
             
        </jsp:plugin>
    </div>
</body>
</html>