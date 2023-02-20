
    <html>
      <head>
        <title>Simple</title>
      </head>
      <body style="font-family:verdana;font-size:10pt;">
        <%@ page isErrorPage="true" %>
        <%@ include file="Header.jsp" %>
        <br>
        <center><b>Exception is: <%= exception %> </b></center>
        <br>
         <jsp:include page="Footer.jsp"/>
      </body>
    </html>
 