<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display image on choice</title>
<style>
	img {
		height: 50%;
		width: 50%; 
	}
</style>

</head>
<body>
	<form action="Images.jsp">
		<label>Choose an Animal:</label> <select name="animals" id="Animals">
			<option value="none">Animal</option>
			<option value="unicorn">Unicorn</option>
			<option value="dragon">Dragon</option>
			<option value="rhino">Rhino</option>

		</select><br> <input type="submit" value="submit">
	</form>

	<%
		String animals = request.getParameter("animals");
	%>
<iframe src="C:\Users\Coditas\Downloads\<%=animals%>.jpg" height="600px" width="800px" ></iframe>



</body>
</html>