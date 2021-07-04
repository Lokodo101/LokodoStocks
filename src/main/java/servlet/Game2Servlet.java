package servlet;

import launch.Main;

import java.io.File;
import java.io.FileWriter;
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
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

        out.write("<h1> Game Page 2</h1>".getBytes());

        //Imported from LokodoStocks

        File myObj = new File("scoresheetUsernames.txt");
        myObj.createNewFile();
        System.out.println("File created: " + myObj.getName());


        long time =  System.currentTimeMillis() - Main.startTime;

        double  timeButBetter = time * 0.001;

        System.out.println(time);

        String word = req.getParameter("word");
        String username = req.getParameter("username");

        System.out.println();

        System.out.println("word: " + word);





        out.write("<p> Score page </p>".getBytes());
        out.write(String.format("<p> Congrats ,%s you have a time of %f seconds ",username, timeButBetter).getBytes());
        out.write("".getBytes());
        out.write("".getBytes());
        out.write("".getBytes());
        out.write("".getBytes());


        FileWriter myWriter = new FileWriter("scoresheetUsernames.txt", true);
        myWriter.write(String.format("\n%f -- %s", timeButBetter,username));
        myWriter.close();
        System.out.println("Successfully wrote to the file.");


        out.flush();
        out.close();
    }

}

