package servlet;

import launch.Main;

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
        name = "GameServlet",
        urlPatterns = {"/game"}
)
public class GameServlet extends HttpServlet {

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

        out.write("p {".getBytes());
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

        // Setting up random Question

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

        //Question Title

        out.write("<h1>Question</h1>".getBytes());

        //Question Paragraph and word
        out.write(String.format("Enter the word below in the field as fast as possible! <br><b> %s </b><br> ...", questionWord).getBytes());

        //Entering form

        String username = req.getParameter("username");

        //Question Validation

        int maxlen = questionWord.length();
        int minlen = questionWord.length() -1;


        out.write("<form method=\"post\" action=\"/game2\" >".getBytes());
        out.write(String.format("<input type=\"text\" name=\"word\" pattern=\"%s\" minlength=\"%d\" maxlength=\"%d\">",questionWord,minlen,maxlen).getBytes());
        out.write(String.format("<input type=\"hidden\" name=\"username\" value=\"%s\">", username).getBytes());
        out.write("<input type=\"submit\" value=\"Enter\">".getBytes());
        out.write("</form>".getBytes());

        Main.startTime = System.currentTimeMillis();




        out.flush();
        out.close();
    }

}

