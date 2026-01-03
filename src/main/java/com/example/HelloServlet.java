package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello DevOps 🚀</h1>");
        response.getWriter().println("<p>This app is deployed on Tomcat</p>");
    }
}

