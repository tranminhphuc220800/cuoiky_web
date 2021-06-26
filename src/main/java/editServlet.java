import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "editServlet", value = "/editServlet")
public class editServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idnote = request.getParameter("id");
        dao dao =new dao();
        notemodel notemodel =  dao.getnotebyidnote(idnote).get(0);
        request.setAttribute("note",notemodel);
        request.getRequestDispatcher("/WEB-INF/edit.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     String  idnote =request.getParameter("idnote")  ;
     int id = Integer.parseInt(idnote);
        String  title =request.getParameter("title")  ;
        String  content =request.getParameter("content") ;
        dao dao =new dao();
        dao.editbyidnote(id,title,content);
        response.sendRedirect("loaderServlet");




    }
}
