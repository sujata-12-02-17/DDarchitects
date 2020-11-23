package in.ddarcitects.BlogController;

import in.ddarcitects.dao.BlogDao;
import in.ddarcitects.daoImpl.BlogDaoImpl;
import in.ddarcitects.model.Blog;
import in.ddarcitects.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BlogViewController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    BlogDao blogDao = new BlogDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Blog> blogs =blogDao.findAllBlog();

        req.setAttribute("blogs",blogs);
        req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
