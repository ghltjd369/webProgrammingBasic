import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@WebServlet(name = "Servlet", value = "/today")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Calendar c = Calendar.getInstance();
        PrintWriter out = response.getWriter();
        out.println(Integer.toString(c.get(Calendar.SECOND)));
        out.println("<a href=\"http://localhost:63342/webProgrammingBasic/makemypage/web/index.html\">홈</a>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
