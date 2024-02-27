package com.messaging;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String reqId = request.getParameter("id");
		String reqPwd = request.getParameter("password");
//        String sql = "SELECT  id\n"
//        		+ "	FROM public.\"Faculty\";";
        String url = "jdbc:postgresql://localhost/postgres";
        String sql1="SELECT * FROM public.\"User\"\n"
        		+ "ORDER BY \"mailId\" ASC ";
        String uname = "postgres";
        String pwd = "postgres";
        Connection conn;
		try {
			System.out.println("Inside try");
			conn = DriverManager.getConnection(url, uname, pwd);
			Statement st = conn.createStatement();
			String rsPwd = null;
			ResultSet rs = st.executeQuery(sql1);
			out.println("<html>");
			int x=1;

            while (rs.next()) {
//            	System.out.println("Inside while");
            	//System.out.println("ResultSet:"+rs);
            	String id = rs.getString("mailId");
//            	System.out.println("rs pwd:"+rs.getString("password"));
//            	System.out.println("reqPwd:"+reqPwd);
//            	System.out.println("id:"+id.trim());
//            	System.out.println("reqId:"+reqId.trim());
                if(id.trim().equals(reqId.trim())) {
//                	System.out.println("id:"+id);
//                	System.out.println("Inside if....");
                	rsPwd = rs.getString("password");
//                	System.out.println("rs pwd:"+rs.getString("password"));
//                	System.out.println("id is in db");
                	x=2;
                	break;
                }
                else {
                	out.println("id not found in DB");
                }
                if(x==2)
                	break;
                //out.println(rs.getInt("id")+" "+rs.getString("name"));
            }
        	System.out.println("rs pwd:"+rs.getString("password"));
        	System.out.println("reqPwd:"+reqPwd);
            System.out.println("rs pwd:"+rs.getString("password").length());
        	System.out.println("reqPwd:"+reqPwd.length());
//        	String s1=reqPwd.trim();
//        	String s2=rs.getString("password").trim();
        
            if(reqPwd.trim().equals(rsPwd.trim())) {
//            	System.out.println("redirecting....");
//            	System.out.println("rs pwd:"+rs.getString("password"));
//            	System.out.println("reqPwd:"+reqPwd);
            	response.sendRedirect("index.html");
            }
            else {
            	System.out.println("pwd not correct");
            }
            out.println("</html>");
            rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}


