import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")

public class Login extends HttpServlet {



    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        handleRequest(req, resp);
    }

    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");

        String param1 = req.getParameter("username");
        String param2 = req.getParameter("userpass");

        if ("".equals(param1) || "".equals(param2)) {
            PrintWriter out = resp.getWriter();

            out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");
            out.write("<p style='color: red; font-size: larger;'>You have not entered a username and password</p>");
            out.close();
        } else {
            PrintWriter out = resp.getWriter();

            out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");

            if((param1.equalsIgnoreCase("bleenok")) && (param2.equals("12345"))) {
                out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + param1 + "</span>, You are an authorised login!</p>");
            } else {
                out.write("<p style='color: red; font-size: larger;'>You are not an authorised user!</p>");
            }
            out.write("</div></body></html>");
            out.close();
        }
    }
}