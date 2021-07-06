package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "LoginServlet",
        urlPatterns = {"/login"}
)
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        int counter = 1;

        //CSS Style

        out.write("<style>".getBytes());
        out.write("h1 {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("text-align: center".getBytes());
        out.write("}".getBytes());

        out.write("#scoreboard {".getBytes());
        out.write("font-family:arial,helvetica;".getBytes());
        out.write("text-align: center".getBytes());
        out.write("border-collapse: collapse;\n".getBytes());
        out.write("border-collapse: collapse;\n".getBytes());
        out.write("}".getBytes());

        out.write("#scoreboard tr:hover {background-color: #ddd;}\n}\n".getBytes());
        out.write("#scoreboard tr:nth-child(even){background-color: #f2f2f2;}\n".getBytes());

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
        out.write("<button type=\"button\"><a href=\"/home\"> Back </a></button>".getBytes());
        out.write("<br>".getBytes());
        out.write("</div>".getBytes());

        // Title
        out.write("<spacer type=\"horizontal\" width=\"100\" height=\"30\"> \n </spacer>".getBytes());
        out.write("<h1>Login page</h1>".getBytes());

        // Form

        out.write("<form method=\"post\" action=\"dashboard\">".getBytes());
        out.write("<p> Please place your username here:- </p>".getBytes());
        out.write("<input type=\"text\" name=\"username\" pattern=\"[a-zA-Z0-9]+\" minlength=\"4\" maxlength=\"12\" required>".getBytes());
        out.write("<input type=\"submit\" value=\"enter\">".getBytes());
        out.write("</form>".getBytes());






        out.flush();
        out.close();
    }

}
