<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//JSONObject obj = (JSONObject)request.getAttribute("obj");
		String t = (String)request.getAttribute("obj");
		out.println(t);
		JSONObject obj = new JSONObject(t);
		out.println(obj.toString(5));
		//System.out.println("In show.jsp");
	%>
</body>
</html>