package com.manju;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Demo extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		List<Student> students = Arrays.asList(new Student(1,"Manju"),new Student(2,"Amirthavarshini"));
		
		//String name = "Manju";
		getServletContext().setAttribute("k", students);
		req.getRequestDispatcher("disp.jsp").forward(req, res);
	}
}
