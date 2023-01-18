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
        out.print("<a href=\"http://localhost:63342/webProgrammingBasic/makemypage/web/index.html\">메인화면</a><br>");
        out.print("<section style=\"position:relative;top:100px;\">");
        out.print("<p style=\"font-size:80px;text-align:center\">현재시간 : ");
        out.print(Integer.toString(c.get(Calendar.YEAR)));
        out.print("/");
        out.print(Integer.toString(c.get(Calendar.MONTH) + 1));
        out.print("/");
        out.print(Integer.toString(c.get(Calendar.DATE)));
        out.print(" ");
        out.print(Integer.toString(c.get(Calendar.HOUR)));
        out.print(":");
        out.println(Integer.toString(c.get(Calendar.MINUTE)));
        out.print("</p>");
        out.print("</section>");
    }

}
