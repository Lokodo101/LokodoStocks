package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "LoginServlet",
        urlPatterns = {"/Login"}
)
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();

            out.write("<form method=\"post\" action=\"/Word\" >".getBytes());
            out.write("<p> Please login here:- </p>".getBytes());
            out.write("<input type=\"hidden\" name=\"username\">".getBytes());
            out.write("<input type=\"submit\" value=\"Enter\">".getBytes());
            out.write("</form>".getBytes());


        out.flush();
        out.close();
    }

}
