package com.team.teamsite6;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Makasyeyeva
 * **/

@WebServlet(name = "MariyaMakasyeyevaServlet", value = "/mariya_makasyeyeva")
public class MariyaMakasyeyevaServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"line-height: 150%\">");
        out.println("<h1>Mariya Mew-kasyeyeva</h1>");
        out.println("<img src=\"images/makasyeyeva.jpg\" alt=\"Makasyeyeva image\" width=\"600\" height=\"600\">");
        out.println("<br/>");
        out.println("<p>Human name: Mariya Makasyeyeva</p>");
        out.println("<p>Age: 21</p>");
        out.println("<p>Hobby: cooking, reading</p>");
        out.println("<p>Sport: dancing, horse riding</p>");
        out.println("<p>Favorite movie:</p>");
        out.println("<a href=\"https://fmoviesz.to/movie/harry-potter-and-the-order-of-the-phoenix-ojj4/1-1\">Harry Potter and the Order of the Phoenix</a>");
        out.println("<br/><br/>");
        out.println("<button style=\"display:block\" onclick=\"history.back()\">Back</button>");
        out.println("</body></html>");
    }
}
