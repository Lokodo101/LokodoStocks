package servlet;

import launch.Main;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "WordServlet",
        urlPatterns = {"/Word"}
)
public class WordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();



            out.write("<form method=\"post\" action=\"/Score\" >".getBytes());
            out.write("<p> Destablishementarism </p>".getBytes());
            out.write("<input type=\"text\" name=\"word\">".getBytes());
            out.write("<input type=\"submit\" value=\"GameWord\">".getBytes());
            out.write("</form>".getBytes());

            Main.startTime = System.currentTimeMillis();


        out.flush();
        out.close();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String questionWord = "";

        String username = req.getParameter("Username");

        System.out.println("Username : " + username);

        ServletOutputStream out = resp.getOutputStream();

        out.write("<form method=\"post\" action=\"/Score\" >".getBytes());
        out.write("<p> Destablishementarism </p>".getBytes());
        out.write("<input type=\"text\" name=\"word\">".getBytes());
        out.write("<input type=\"submit\" value=\"GameWord\">".getBytes());
        out.write(String.format("<input type=\"hidden\" name=\"username\" value=\"%s\">",username).getBytes());

        out.write("</form>".getBytes());

        Main.startTime = System.currentTimeMillis();

        File myObj = new File("words.txt");
        Scanner myReader = new Scanner(myObj);
        for(int i = 0 ; i <=1 ; i++){
            questionWord = myReader.nextLine();
            System.out.println("Egg");
        }

        System.out.println(questionWord);
        out.write(questionWord.getBytes());

        out.flush();
        out.close();


    }


}

