package com.team.teamsite6;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Makasyeyeva
 **/
@WebServlet(name = "DariaHorlachServlet", value = "/daria_horlach")
public class DariaHorlachServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"line-height: 150%\">");
        out.println("<h1>Daria Purr-lach</h1>");
        out.println("<img src=\"images/horlach.jpg\" alt=\"Horlach image\" width=\"600\" height=\"600\">");
        out.println("<br/>");
        out.println("<p>Human name: Daria Horlach</p>");
        out.println("<p>Age: 17</p>");
        out.println("<p>Hobby: drawing</p>");
        out.println("<p>Sport: fitness</p>");
        out.println("<p>Favorite movie:</p>");
        out.println("<a href=\"https://fmoviesz.to/tv/gossip-girl-mj56v/1-1\">Gossip Girl</a>");
        out.println("<br/><br/>");
        out.println("<button style=\"display:block\" onclick=\"history.back()\">Back</button>");
        out.println("</body></html>");
    }
}
