package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "mainMenu",
        urlPatterns = {"/main"}
)
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();

        out.write("<form method=\"post\" action=\"/Login\" >".getBytes());
        out.write("<input type=\"submit\" value=\"Login\">".getBytes());
        out.write("</form>".getBytes());
        out.write("<form method=\"post\" action=\"/scoreboard\" >".getBytes());
        out.write("<input type=\"submit\" value=\"Scoreboard\">".getBytes());
        out.write("</form>".getBytes());


        out.flush();
        out.close();
    }

}
