package com.team.teamsite6;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "TeamServlet", value = "/team")
public class TeamServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello from Cat Team!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<img src=\"images/cat.jpg\" alt=\"Team image\" width=\"600\" height=\"600\">");
        out.println("<br/>");
        out.println("<a href=\"mariya_makasyeyeva\">Mariya Makasyeyeva</a>");
        out.println("<br/>");
        out.println("<a href=\"daria_horlach\">Daria Horlach</a>");
        out.println("<br/>");
        out.println("<a href=\"polina_sokolova\">Polina Sokolova</a>");
        out.println("<br/><br/>");
        out.println("<a href=\"javascript:history.back()\">Back</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}