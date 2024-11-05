import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printer = response.getWriter();

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = formatter.format(new Date());
        String[] timeParts = formattedTime.split(":");

        String hours = timeParts[0];
        String minutes = timeParts[1];
        String seconds = timeParts[2];

        printer.println("<!DOCTYPE html>");
        printer.println("<html lang='en'>");
        printer.println("<head>");
        printer.println("<meta charset='UTF-8'>");
        printer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        printer.println("<title>Styled Clock</title>");
        printer.println("<link rel='stylesheet' href='styles/clock.css'>");
        printer.println("<script src='scripts/clock.js'></script>");
        printer.println("</head>");
        printer.println("<body onload='updateTime()'>");
        printer.println("<nav>");
        printer.println("<a href='time'>Time Servlet</a> | ");
        printer.println("<a href='RedirectServlet'>Redirect Servlet</a> | ");
        printer.println("<a href='login.html'>Login</a>");
        printer.println("</nav>");
        printer.println("<h1>Hello World, This Is My First Servlet</h1>");
        printer.println("<div id='flip-clock' class='clock'>");
        printer.println("<div class='digit' id='hours' data-title='HOURS'>" + hours + "</div>");
        printer.println("<div class='digit' id='minutes' data-title='MINUTES'>" + minutes + "</div>");
        printer.println("<div class='digit' id='seconds' data-title='SECONDS'>" + seconds + "</div>");
        printer.println("</div>");
        printer.println("</body>");
        printer.println("</html>");
    }
}
