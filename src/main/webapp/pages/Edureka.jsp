<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><br>
<h2><u>Add User Details</u></h2>
<h3><a href="/getdetails">Get Details</a></h3>
<form method="post" action="details">
<table>
<tr><th>Enter Customer ID : </th><th><input type="text" name="custid" required"></th></tr>
<tr><th>Enter Customer Name : </th><th><input type="text" name="custname" required></th></tr>
<tr><th>Enter Customer Email Address : </th><th><input type="email" name="custemail" required></th></tr>
<tr><th><input type="reset" Value="Reset"></th><th><input type="submit" Value="Add"></th></tr>
</table>
</form>
</center>
</body>
</html>