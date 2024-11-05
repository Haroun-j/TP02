import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String page = request.getParameter("page");

        if (page != null && !page.trim().isEmpty()) {
            if ("PageRedirect".equals(action)) {
                response.sendRedirect("https://" + page);
            } else if ("GoogleSearch".equals(action)) {
                response.sendRedirect("https://www.google.com/search?q=" + page);
            } else {
                response.getWriter().println("Invalid action parameter.");
            }
        } else {
            response.getWriter().println("Invalid parameters for redirection.");
        }
    }
}
