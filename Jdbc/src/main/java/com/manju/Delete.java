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

public class Delete extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		//String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
        String url = "jdbc:postgresql://localhost/postgres";
        String uname = "postgres";
        String pwd = "postgres";
        Connection conn;
		try {
			conn = DriverManager.getConnection(url, uname, pwd);
			Statement st = conn.createStatement();
			String sql1 = "DELETE FROM public.\"Student\"\n" +
                    "\tWHERE id="+id+";";
            st.executeUpdate(sql1);
            out.println("Deleted Student record");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("Record not deleted");
			e.printStackTrace();
		}
	}
}