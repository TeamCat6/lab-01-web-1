package com.team.teamsite6;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

/**
 * @author Makasyeyeva
 **/
@WebServlet(name = "TeamServlet", value = "/team")
public class TeamServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello from Cat Team!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"line-height: 150%\">");
        out.println("<h1>" + message + "</h1>");
        out.println("<img src=\"images/cat.jpg\" alt=\"Team image\" width=\"600\" height=\"600\">");
        out.println("<p style=\"display:block\"><strong>Who we are</strong></p>");
        out.println("<p>We are a team of friendly and smart cats. We enjoy programming and solving real life tasks." +
                " No bug or issue can scare us! We'll hunt them all. Meow)</p>");
        out.println("<button id=\"clicked-button\" style=\"display:block\" onclick=\"showImage()\">Click Me!</button>");
        out.println("<img id=\"hidden-image\" src=\"images/fish.jpeg\" style=\"display:none\" alt=\"Fish\" width=\"500\" height=\"500\">");
        out.println("<p id=\"hidden-message\" style=\"display:none\">Here is a present for you! " +
                "<i>A bucket full of delicious fish!</i></p>");
        out.println("<p style=\"display:block\"><b>Meet our Paw-team:</b></p>");
        out.println("<a href=\"mariya_makasyeyeva\">Mariya Mew-kasyeyeva</a>");
        out.println("<br/>");
        out.println("<a href=\"daria_horlach\">Daria Purr-lach</a>");
        out.println("<br/>");
        out.println("<a href=\"polina_sokolova\">Polina Purr-kolova</a>");
        out.println("<br/><br/>");
        out.println("<button style=\"display:block\" onclick=\"history.back()\">Back</button>");
        out.println("<script>" +
                "function showImage() {" +
                "document.getElementById(\"hidden-image\").style.display = \"inline-block\";" +
                "document.getElementById(\"clicked-button\").style.display = \"none\";" +
                "document.getElementById(\"hidden-message\").style.display = \"block\";" +
                "}"
                + "</script>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}