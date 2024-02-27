package com.manju;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateFaculty extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
        String url = "jdbc:postgresql://localhost/postgres";
        String uname = "postgres";
        String pwd = "postgres";
        Connection conn;
		try {
			conn = DriverManager.getConnection(url, uname, pwd);
			Statement st = conn.createStatement();
			String insertQuery = "INSERT INTO public.\"Faculty\"(\n"
					+ "	mailid, id, name, password1)\n"
					+ "	VALUES ('"+mail+"',"+id+",'"+name+"','"+password+"');";
			out.println("Record inserted");
			st.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("Record not inserted");
			e.printStackTrace();
		}
		response.sendRedirect("HomePage.html");
	}
}
