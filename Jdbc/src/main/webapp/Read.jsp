<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student List</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        table {
            width: 50%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body bgcolor='pink'>

	
<table>
  <caption><h2>Student List</h2></caption>
    <thead>
        <tr>
            <th>Student Name</th>
            <th>ID</th>
            <th>Name</th>
        </tr>
    </thead>
    <tbody>

	<%
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
			//out.println("<html>");
	        while (rs.next()) {
	    %>
	    	
	            <tr>
	                       <td> <%= count %></td>
	                        <td><%= rs.getInt("id")%></td>
	                        <td><%= rs.getString("name")%></td>
	             </tr>
	     <% 
	            count+=1;
	            //out.println(rs.getInt("id")+" "+rs.getString("name"));
	        }
	        //out.println("</html>");
	        rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("Record not inserted");
			e.printStackTrace();
		}
	%>

</body>
</html>