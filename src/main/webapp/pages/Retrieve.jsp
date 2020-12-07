<%@page import="com.example.demo.Customers"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">List of Customers :- </h1><br>
<center><a href="deleteall"><input type="button" value="Delete All"></a></center>
<br>
<table align="center" border="2px" cellpadding="2px">

<% 
List list=(ArrayList)request.getAttribute("sss");
for(Object ss:list)
{
	Customers cos=(Customers)ss;
	%>
	<tr><th><%=cos.getCustid() %></th><th><%=cos.getCustname() %></th><th><%=cos.getCustemail() %></th><th><a href="delete?custid=<%=cos.getCustid() %>"><input type="button" value="delete"></a></th></tr>
	<%
}
%>
</table>
</body>
</html>