<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ActionDemo</title>
</head>
<body>
<jsp:forward page="Header.jsp">
    <jsp:param value="Gita" name="data"/>
    <jsp:param value="11-3-22" name="data1"/>
</jsp:forward>

</body>
</html>