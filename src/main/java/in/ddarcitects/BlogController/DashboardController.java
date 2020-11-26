package in.ddarcitects.BlogController;

import in.ddarcitects.dao.BlogDao;
import in.ddarcitects.dao.UserDao;
import in.ddarcitects.daoImpl.BlogDaoImpl;
import in.ddarcitects.daoImpl.UserDaoImpl;
import in.ddarcitects.model.Blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/dashboard")
public class DashboardController  extends HttpServlet {
    BlogDao blogDao = new BlogDaoImpl();
    UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int blogsCount =blogDao.CountBlog();
        int usersCount= userDao.CountUser();

        req.setAttribute("blogsCount",blogsCount);
        req.setAttribute("usersCount",usersCount);
        req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
