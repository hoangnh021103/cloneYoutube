package UserVIdeo;

import com.example.ASM1.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({
        "/USer1",
        "/delete-USer1",
        "/update-USer1"
})
public class USerSelvlet extends HttpServlet {
 USerservice service= new USerservice();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("/delete-USer1")){
            String id=req.getParameter("Id");
            service.deleteByID(id);
            resp.sendRedirect("USer1");
            return;
        }
        if (uri.contains("/update-USer1")){
            String id=req.getParameter("Id");
            USer u= service.findByid(id);
            req.setAttribute("currentUSer",u);
        }
        req.setAttribute("list",service.getAll());
        req.getRequestDispatcher("/userVideo/Video.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Id = req.getParameter("Id");
        String Title = req.getParameter("Title");
        String Description=req.getParameter("Description");
        Boolean Active =req.getParameter("Active")  !=null;
        String Poster = req.getParameter("Poster");
        USer u = new USer(Id,Title,Description,Active,Poster);
        if (req.getRequestURI().contains("/update-USer1")){
            service.update(u);

        }else {
            service.add(u);
        }
        service.add(u);
        resp.sendRedirect("USer1");
    }
}
