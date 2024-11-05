import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        if ("J2EE".equals(username) && "J2EE".equals(password)) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Login Success</title>");
            out.println("<link rel='stylesheet' href='styles/login.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav>");
            out.println("<a href='time'>Time Servlet</a> | ");
            out.println("<a href='redirect'>Redirect Servlet</a> | ");
            out.println("<a href='login.html'>Login</a>");
            out.println("</nav>");
            out.println("<div class='container'>");
            out.println("<div class='login-box'>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<form action='RedirectServlet' method='GET'>");
            out.println("<div class='input-group'>");
            out.println("<label for='action'>Action:</label>");
            out.println("<select id='action' name='action'>");
            out.println("<option value='GoogleSearch'>Google Search</option>");
            out.println("<option value='PageRedirect'>Page Redirect</option>");
            out.println("</select>");
            out.println("</div>");
            out.println("<div class='input-group'>");
            out.println("<label for='page'>Page URL:</label>");
            out.println("<input type='text' id='page' name='page'>");
            out.println("</div>");
            out.println("<button type='submit' class='login-btn'>Submit</button>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body></html>");
        } else {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Login Failed</title>");
            out.println("<link rel='stylesheet' href='styles/login.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav>");
            out.println("<a href='time'>Time Servlet</a> | ");
            out.println("<a href='redirect'>Redirect Servlet</a> | ");
            out.println("<a href='login.html'>Login</a>");
            out.println("</nav>");
            out.println("<h2>Identifiants de connexion invalides. <a href='login.html'>Veuillez réessayer.</a></h2>");
            out.println("</body></html>");
        }
    }
}
