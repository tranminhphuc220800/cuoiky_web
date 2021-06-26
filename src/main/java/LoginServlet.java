import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns= "/mphuc")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>(*)Succeeded</h1>");
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html:charset=utf-8");
     HttpSession session =request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

       dao dao =new dao();
         List<notemodel>  list= dao.getnotesbyiduser(username);

        if(list.size() != 0){
            session.setAttribute("user",username);
           response.sendRedirect("loaderServlet");

        }else {
            response.sendRedirect("login.jsp");
        }

    }
}
