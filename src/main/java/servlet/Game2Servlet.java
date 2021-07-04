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
        name = "Game2Servlet",
        urlPatterns = {"/game2"}
)
public class Game2Servlet extends HttpServlet {

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
        out.write("</style>".getBytes());

        //Title

        out.write("<h1>Typing Game!</h1>".getBytes());

        out.write("<button type=\"button\"><a href=\"/login\"> Login </a></button>".getBytes());


        out.write("<body>".getBytes());

        // Creates the table

        out.write("<table class=\"center\" id=\"scoreboard\">".getBytes());
        out.write("<tr>".getBytes());
        out.write("<th> # </th>".getBytes());
        out.write("<th> Score -- Name </th>".getBytes());
        out.write("</tr>".getBytes());

        //Inputs the scores

        File myObj = new File("scoresheetUsernames.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            out.write("<tr>".getBytes());
            out.write(String.format("<th> %d </th>", counter).getBytes());
            out.write(String.format("<th> %s</th>", data).getBytes());
            out.write("</tr>".getBytes());
            counter = counter + 1;

        }
        myReader.close();
        out.write("</table>".getBytes());

        out.write("</body>".getBytes());


        out.flush();
        out.close();
    }

}

