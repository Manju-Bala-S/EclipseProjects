package com.manju;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Insert extends HttpServlet{
	private static Logger logger1 = LogManager.getLogger(Main.class.getName());
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			PrintWriter out = response.getWriter();
	        String url = "jdbc:postgresql://localhost/postgres";
	        String uname = "postgres";
	        String pwd = "postgres";
	        Connection conn;
			try {
				conn = DriverManager.getConnection(url, uname, pwd);
				Statement st = conn.createStatement();
				String insertQuery = "INSERT INTO public.\"Student\"(\n" +
		                "\tid, name)\n" +
		                "\tVALUES ("+id+",'"+name+"');";
				out.println("Record inserted");
				st.executeUpdate(insertQuery);
				logger1.info("Student created");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				out.println("Record not inserted");
				e.printStackTrace();
			}
		}
	}
