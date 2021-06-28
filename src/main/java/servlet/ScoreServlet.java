package servlet;

import launch.Main;

import java.io.IOException;

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



        long time =  System.currentTimeMillis() - Main.startTime;

        System.out.println(time);

        String word = req.getParameter("word");

        System.out.println();

        System.out.println("word: " + word);

        ServletOutputStream out = resp.getOutputStream();




        out.write("<p> Score Page idk I'm not a java person </p>".getBytes());
        out.write("".getBytes());
        out.write("".getBytes());
        out.write("".getBytes());
        out.write("".getBytes());
        out.write("".getBytes());


        out.flush();
        out.close();


    }


}
