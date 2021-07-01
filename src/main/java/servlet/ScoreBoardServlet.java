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
        name = "Scoreboard",
        urlPatterns = {"/scoreboard"}
)
public class ScoreBoardServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();

        int counter = 1;

        





















































        .

        out.write("<h1> Scoreboard </h1>".getBytes());
        out.write("<p> Here are the players that are the best at typing, keep at it gamers!</p>".getBytes());

        File myObj = new File("scoresheetUsernames.txt");
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            out.write(String.format("-- %d -- %s -- <br>",counter,data).getBytes());
            counter = counter + 1;

        }
        myReader.close();





        out.flush();
        out.close();
    }

}
