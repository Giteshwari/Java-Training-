package com.tlibd;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class Details extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
      
      JspWriter out = getJspContext().getOut();
      out.println("<h2>Greetings! Pratik of <span style='color:blue'>MESCOE</span>, It was nice having u as client :)</h2>");
      out.println("<body style='background-image: url(\"https://media.giphy.com/media/SpopD7IQN2gK3qN4jS/giphy.gif\");\r\n"
      		+ " 		background-color: #cccccc;\r\n"
      		+ " 		height: 700px; \r\n"
      		+ " 		background-position: center; \r\n"
      		+ "  		background-repeat: no-repeat; \r\n"
      		+ "  		background-size: cover;'");
   }
}