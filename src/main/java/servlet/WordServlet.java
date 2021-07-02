package servlet;
import java.lang.Math;
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

        int min = 1;

        int max = 53;

        String questionWord = "";

        File myObj = new File("words.txt");
        Scanner myReader = new Scanner(myObj);
        int randomNum = (int)(Math.random()*(max-min+1)+min);
        for(int i = 0 ; i <= randomNum ; i++){
            questionWord = myReader.nextLine();
        }

        System.out.println(questionWord);

        String username = req.getParameter("Username");

        System.out.println("Username : " + username);

        ServletOutputStream out = resp.getOutputStream();

        out.write("<form method=\"post\" action=\"/Score\" >".getBytes());
        out.write(String.format("Your word is:  %s . <br>", questionWord).getBytes());


        out.write("<input type=\"text\" name=\"word\">".getBytes());
        out.write("<input type=\"submit\" value=\"GameWord\">".getBytes());
        out.write(String.format("<input type=\"hidden\" name=\"username\" value=\"%s\">",username).getBytes());

        out.write("</form>".getBytes());

        Main.startTime = System.currentTimeMillis();

        out.flush();
        out.close();



    }


}

