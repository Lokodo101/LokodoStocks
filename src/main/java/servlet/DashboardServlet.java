package servlet;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "DashboardServlet",
        urlPatterns = {"/dashboard"}
)
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        int counter = 1;

        //CSS Style
        // H1 is no Longer centered!
        out.write("<style>".getBytes());
        out.write("h1 {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("text-align: left".getBytes());
        out.write("}".getBytes());

        out.write("#scoreboard {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("text-align: center".getBytes());
        out.write("border-collapse: collapse;\n".getBytes());
        out.write("border-collapse: collapse;\n".getBytes());
        out.write("}".getBytes());

        out.write("#scoreboard tr:hover {background-color: #ddd;}\n}\n".getBytes());
        out.write("#scoreboard tr:nth-child(even){background-color: #f2f2f2;}\n".getBytes());

        //Increasing the size of menu boxes

        out.write(".menu {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("font-size: 28px".getBytes());
        out.write("}".getBytes());

        //Center, Tr, Td

        out.write(".center {".getBytes());
        out.write("margin-left: auto;".getBytes());
        out.write("margin-right: auto;".getBytes());
        out.write("padding: 5px;".getBytes());
        out.write("border: 1px solid black;".getBytes());
        out.write("}".getBytes());

        out.write("tr {".getBytes());
        out.write("padding: 5px;".getBytes());
        out.write("}".getBytes());

        out.write("td {".getBytes());
        out.write("padding: 5px;".getBytes());
        out.write("}".getBytes());

        out.write("body {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("text-align: center".getBytes());
        out.write("}".getBytes());
        out.write("table, th, td {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("text-align: center".getBytes());
        out.write("}".getBytes());

        out.write(".topnav-right{".getBytes());
        out.write("float: right;".getBytes());
        out.write("text-align: center;".getBytes());
        out.write("padding: 14px 16px;".getBytes());
        out.write("text-decoration: none;".getBytes());
        out.write("font-size: 17px;".getBytes());
        out.write("}".getBytes());

        out.write("</style>".getBytes());

        // BackOut Menu

        out.write("<div class=\"topnav-right\">".getBytes());
        out.write("<button type=\"button\"><a href=\"/home\"> Main </a></button>".getBytes());
        out.write("<br>".getBytes());
        out.write("</div>".getBytes());

        // Grabbing username
        String username = req.getParameter("username");

        // Title with username
        out.write("<spacer type=\"horizontal\" width=\"100\" height=\"30\"> \n </spacer>".getBytes());
        out.write(String.format("<h1> Welcome <br> %s </h1>",username).getBytes());

        // Section - Menu

        out.write("<div class=\"menu\">".getBytes());
        out.write("<section>".getBytes());
        out.write("<form method=\"post\" action=\"/game\">".getBytes());
        out.write("<input type=\"submit\" value=\"Play\">".getBytes());
        out.write(String.format("<input type=\"hidden\" name=\"username\" value=\"%s\">",username).getBytes());
        out.write("</form>".getBytes());
        out.write("</section>".getBytes());
        out.write("<section>".getBytes());

        out.write("<form method=\"post\" action=\"/scoreboard\">".getBytes());
        out.write("<input type=\"submit\" value=\"Scoreboard\">".getBytes());
        out.write(String.format("<input type=\"hidden\" name=\"username\" value=\"%s\">",username).getBytes());
        out.write("</form>".getBytes());


        out.write("</section>".getBytes());
        out.write("</div>".getBytes());






        out.flush();
        out.close();
    }

}
