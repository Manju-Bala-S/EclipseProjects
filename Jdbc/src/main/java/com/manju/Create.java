package com.manju;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Create extends HttpServlet {
	private static Logger logger1 = LogManager.getLogger(Main.class.getName());
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        	  ThreadContext.put("traceId", "Create(C)");
    		  logger1.info("User is entering id");
        	  PrintWriter out = response.getWriter();
              out.println("<html>");
              out.println("<form action=\"insert\">");
              out.println("Enter id:<input type=\"number\" name=\"id\">");
              out.println("<br/>");
              out.println("<br/>");
              out.println("<br/>");
              logger1.info("User is entering name");
              out.println("Enter name:<input type=\"text\" name=\"name\">");
              out.println("<br/>");
              out.println("<br/>");
              out.println("<br/>");
              logger1.info("User is going to submit the form");
              out.println("<input type=\"submit\" value=\"Click to create a new student\"/>");
              logger1.info("User submitted the form");
              ThreadContext.clearAll();
              out.println("</form>");
              out.println("</html>");
    }
        catch(Exception e) {
        	logger1.error("Got error after submitting the form");
        	ThreadContext.clearAll();
        	e.printStackTrace();
        }
}
}
