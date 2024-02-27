package com.manju;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletEUI extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        	  PrintWriter out = response.getWriter();
              out.println("<html>");
              out.println("<form action=\"deleteRecord\">");
              out.println("Enter id:<input type=\"number\" name=\"id\">");
              out.println("<br/>");
              out.println("<br/>");
              out.println("<br/>");
              out.println("<input type=\"submit\" value=\"Click to delete\"/>");
              out.println("</form>");
              out.println("</html>");
    }
        catch(Exception e) {
        	e.printStackTrace();
        }
}
}

