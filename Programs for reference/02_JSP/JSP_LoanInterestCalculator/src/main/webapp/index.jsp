<html>
<body>
<%@ page language = "java" %>

<jsp:include page = "Header.jsp" flush = "true"/>

<form  method = "post" action = "controller.jsp">
<table align = "center">
    <tr>
        <td>Enter the principal amount :</td>
        <td><input type="text" name="principal"/></td>
    </tr>
    <tr>
        <td>Enter the interest rate in % :</td>
        <td><input type="text" name="rate"/></td>
    </tr>
    <tr>
        <td>Enter the loan period in months :</td>
        <td><input type="text" name="period"/></td>
    </tr>
        <tr><td>Select Your interest mode : </td>
           <td><input type = "radio" name = "mode" value = "simple">Simple
               <input type = "radio" name = "mode" value = "compound">Compound
           </td>
	</tr>
        	
	<tr>
		<td colspan = "2" align = "center"><input type = "submit" value = "Submit"></td>
                <td colspan = "2" align = "center"><input type = "reset" value = "Clear"></td>
	</tr>
</table>
</form>
<jsp:include page = "Footer.jsp" flush = "true"/>
</body>
</html>