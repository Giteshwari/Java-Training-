

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/form")
public class FormServlet extends HttpServlet
{

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{

		res.setContentType("text/html");

		PrintWriter out=res.getWriter();


		String uname = req.getParameter("user");
		String password = req.getParameter("pass");
		
		

		if(uname.equals("Admin") && password.equals("pass")) {
			
			
			Cookie c = new Cookie("aname",uname);
			res.addCookie(c);
			
			int num1 = 0, num2 = 0;
			out.println("<h3>Welcome "+uname+"</h3>");
			
			out.println("<form action=\"welcome\" method=\"get\">\r\n"
					+ "\r\n"
					+ "Enter number one :<input type=\"text\" name =\"num1\"><br><br>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "Enter number two :<input type=\"text\" name=\"num2\"><br>\r\n"
					+ "<br>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<input type=\"submit\" value=\"Enter\">\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "</form>");
			
			
		
			
			
		}
		else {
			out.println("Sorry !!Either of username or Password was incorrect");
		}


	}

}
