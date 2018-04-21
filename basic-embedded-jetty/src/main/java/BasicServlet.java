import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
	try {
	    response.setStatus(HttpServletResponse.SC_OK);
	    response.setContentType("text/html");
	    response.getWriter().println("<html><body>Hello, world!</body></html>");
	}
	catch (Exception ex) {
	    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	}
    }
}
