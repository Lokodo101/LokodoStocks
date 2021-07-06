package servlet;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "ScoreboardServlet",
        urlPatterns = {"/scoreboard"}
)
public class ScoreboardServlet extends HttpServlet {

    @Override
    //Brings back to home

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

        out.write("<h1>Scoreboard</h1>".getBytes());

        //Scoreboard 50%

        out.write("<table class=\"center\" id=\"scoreboard\" style=\"width:50%\">".getBytes());
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

        //Back button

        out.write("<button type=\"button\"><a href=\"/home\"> Back </a></button>".getBytes());

        // Closing

        out.flush();
        out.close();
    }



    // Brings back to dashboard

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        int counter = 1;

        //Sort TextFile

        BufferedReader reader = null;

        BufferedWriter writer = null;

        //Create an ArrayList object to hold the lines of input file

        ArrayList<String> lines = new ArrayList<String>();

        try
        {
            //Creating BufferedReader object to read the input file

            reader = new BufferedReader(new FileReader("scoresheetUsernames.txt"));

            //Reading all the lines of input file one by one and adding them into ArrayList

            String currentLine = reader.readLine();

            while (currentLine != null)
            {
                lines.add(currentLine);

                currentLine = reader.readLine();
            }

            //Sorting the ArrayList

            Collections.sort(lines);

            //Creating BufferedWriter object to write into output file

            writer = new BufferedWriter(new FileWriter("scoresheetUsernamesSorted.txt"));

            //Writing sorted lines into output file

            for (String line : lines)
            {
                writer.write(line);

                writer.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources

            try
            {
                if (reader != null)
                {
                    reader.close();
                }

                if(writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

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

        // Grabbing username
        String username = req.getParameter("username");

        //Title

        out.write("<h1>Scoreboard</h1>".getBytes());

        //Scoreboard 50%

        out.write("<table class=\"center\" id=\"scoreboard\" style=\"width:50%\">".getBytes());
        out.write("<tr>".getBytes());
        out.write("<th> # </th>".getBytes());
        out.write("<th> Score -- Name </th>".getBytes());
        out.write("</tr>".getBytes());

        //Inputs the scores

        File myObj = new File("scoresheetUsernamesSorted.txt");
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

        //Back button

        out.write("<form method=\"post\" action=\"/dashboard\">".getBytes());
        out.write(String.format("<input type=\"hidden\" name=\"username\" value=\"%s\">",username).getBytes());
        out.write("<input type=\"submit\" value=\"Back\">".getBytes());
        out.write("</form>".getBytes());

        // Closing

        out.flush();
        out.close();
    }

}
