package com.manju;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;

public class Read extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("Name");
        String idString = request.getParameter("id");
        int id = 0;
        if (idString != null && !idString.isEmpty()) {
            try {
                id = Integer.parseInt(idString);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        
        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        
        PrintWriter out = response.getWriter();
        //String s1 = "{\"id\":\""+id+"\",\"Name\":"+name+"\"}";
        JSONObject obj = new JSONObject(s1);
        
        String objStr = obj.toString();
        System.out.println("objStr:"+objStr.charAt(0));
        request.setAttribute("obj", objStr);
        
        RequestDispatcher rd = request.getRequestDispatcher("/Show.jsp");
        rd.forward(request, response);
        
	}
}
