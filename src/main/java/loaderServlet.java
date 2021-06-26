import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "loaderServlet", value = "/loaderServlet")
public class loaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         HttpSession session =request.getSession();
         String user =(String) session.getAttribute("user");
         dao dao =new dao();
         List<notemodel> list = dao.getnotesbyiduser(user);
         request.setAttribute("listnote",list);
         request.getRequestDispatcher("/WEB-INF/app.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
