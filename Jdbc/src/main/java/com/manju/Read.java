package com.manju;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Read extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        String sql = "select * from public.\"Student\";";
        String url = "jdbc:postgresql://localhost/postgres";
        String uname = "postgres";
        String pwd = "postgres";
        Connection conn;
		try {
			conn = DriverManager.getConnection(url, uname, pwd);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			int count=1;
			out.println("<html>");
            while (rs.next()) {
                out.println("<em>Student "+count+":<em><br/>");
                out.println("ID:"+rs.getInt("id")+"<br/>");
                out.println("Name:"+rs.getString("name")+"<br/><br/><br/>");
                count+=1;
                //out.println(rs.getInt("id")+" "+rs.getString("name"));
            }
            out.println("</html>");
            rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("Record not inserted");
			e.printStackTrace();
		}
		}
	}
