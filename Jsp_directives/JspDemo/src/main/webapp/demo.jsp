<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Webpage using jsp</title>
</head>
<body>
<%!
private class ClassDemoInJsp {
  final String foo = "ClassVariableInMethod";

  public String getFoo() {
    return foo;
  }
}
%>
<%! int id=1;
	String name="Giteshwari";
	
	public void display(){
	%>
	<% out.println("Id is: "+id);
		out.println("name is:"+name);%>
	<%!
	}%>
<% 	int a=10,b=10,sum=0;
	sum=a+b;
	%>
	
<br>
Result is : <%=sum %>
	
<%!
public static int add(int a, int b){
	return a+b;
}
%>


<br>
Result of addition is : <%= add(5,6) %>
<br>
A method from class is getting called : <%=new ClassDemoInJsp().getFoo()%>
</body>
</html>