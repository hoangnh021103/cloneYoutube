package com.example.ASM1;

import com.example.ASM1.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({
        "/user",
        "/delete-user",
        "/update-user"
})
public class UserSelvet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("/delete-user")){
            String id=req.getParameter("id");
            service.deleteByID(id);
            resp.sendRedirect("user");
            return;
        }
        if (uri.contains("/update-user")){
            String id=req.getParameter("id");
            User u= service.findByid(id);
            req.setAttribute("currentUser",u);
        }
        req.setAttribute("list", service.getAll());
        req.getRequestDispatcher("/user/index.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String email = req.getParameter("email");
        String password=req.getParameter("password");
        String fullname = req.getParameter("fullname");
        Boolean admin =req.getParameter("admin")  !=null;
        User u = new User(id,email,password,fullname,admin);
        if (req.getRequestURI().contains("/update-user")){
            service.update(u);

        }else {
            service.add(u);
        }
        service.add(u);
        resp.sendRedirect("user");
    }
}

