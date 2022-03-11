<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display image on choice</title>


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
<iframe src="C:\Users\Coditas\Downloads\<%=animals%>.jpg" width="800" height="1000" border="0" frameborder="0"  scrolling="no"></iframe>
<audio controls src="C:\Users\Coditas\Downloads\<%=animals%>.mp3"></audio>



</body>
</html>
