package in.ddarcitects.controller;

import in.ddarcitects.dao.BlogDao;
import in.ddarcitects.dao.UserDao;
import in.ddarcitects.daoImpl.BlogDaoImpl;
import in.ddarcitects.daoImpl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/dashboard")
public class DashboardServlet extends HttpServlet {

    BlogDao blogDao = new BlogDaoImpl();
    UserDao userDao = new UserDaoImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession(false)!=null){
            int blogsCount =blogDao.CountBlog();
            int usersCount= userDao.CountUser();

            request.setAttribute("blogsCount",blogsCount);
            request.setAttribute("usersCount",usersCount);

            request.getRequestDispatcher("dashboard.jsp").forward(request,response);
        } else {
            response.sendRedirect(request.getServletContext().getContextPath()+"/login");
//            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }
}
