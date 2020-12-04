package in.ddarcitects.controller;


import in.ddarcitects.dao.BlogDao;
import in.ddarcitects.dao.UserDao;
import in.ddarcitects.daoImpl.BlogDaoImpl;
import in.ddarcitects.daoImpl.UserDaoImpl;
import in.ddarcitects.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BlogDao blogDao = new BlogDaoImpl();
    UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        UserDao userDao = new UserDaoImpl();
        try {
            User user = userDao.checkLogin(username,password);
            String destPage = "/login.jsp";
            if(user!=null) {
                HttpSession oldHttpSession = req.getSession(false);
                if (oldHttpSession != null) {
                    oldHttpSession.invalidate();
                }
                HttpSession newHttpSession = req.getSession(true);
                newHttpSession.setAttribute("user",user);
                int blogsCount =blogDao.CountBlog();
                int usersCount= userDao.CountUser();

                req.setAttribute("blogsCount",blogsCount);
                req.setAttribute("usersCount",usersCount);
                destPage = "/dashboard.jsp";
                newHttpSession.setMaxInactiveInterval(5 * 60);
            } else {
                String message = "Invalid email/password";
                req.setAttribute("message",message);
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destPage);
            dispatcher.forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
