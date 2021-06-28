package servlet;

import launch.Main;

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


        String username = req.getParameter("Username");

        System.out.println("Username : " + username);

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


}

