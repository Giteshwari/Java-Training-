<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
Name : <%= request.getParameter("data") %>
Date : <%= request.getParameter("data1") %>

<jsp:include page="Footer.jsp" flush="true">
	<jsp:param value="Giteshwari" name="fname"/>
	<jsp:param value="Shinde" name="lname"/>
</jsp:include>
</body>
</html>