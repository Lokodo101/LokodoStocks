package servlet;

import launch.Main;

import java.io.IOException;
import java.io.FileWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;  // Import the File class
import java.io.PrintWriter;


@WebServlet(
        name = "ScoreServlet",
        urlPatterns = {"/Score"}
)
public class ScoreServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

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

        ServletOutputStream out = resp.getOutputStream();




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
