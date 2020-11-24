package in.ddarcitects.BlogController;

import in.ddarcitects.dao.BlogDao;
import in.ddarcitects.dao.UserDao;
import in.ddarcitects.daoImpl.BlogDaoImpl;
import in.ddarcitects.daoImpl.UserDaoImpl;
import in.ddarcitects.model.Blog;
import in.ddarcitects.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value ="/blogaddform")
public class BlogWriteController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BlogDao blogDao = new BlogDaoImpl();
    private UserDao userDao = new UserDaoImpl();

    public BlogWriteController() {

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users =userDao.findAllUser();
        //System.out.println(users.size());
        req.setAttribute("users",users);
        req.getRequestDispatcher("blog-add-form.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                    String blogTitle=req.getParameter("blog-title");
                    System.out.println(blogTitle);
                   // System.out.println("........"+req.getParameter("blog-short-text"));
                    String shortText=req.getParameter("blog-short-text");
                     System.out.println(shortText);
                    String blogDescription=req.getParameter("blog-description");
                     System.out.println(blogDescription);
                    //String featureImageUrl=req.getParameter("featureImageUrl");
                    Long  userId= Long.parseLong(req.getParameter("author"));
                    System.out.println(userId);
                    boolean  isPublished= req.getParameterMap().containsValue(1);

                    Blog blog=new Blog(blogTitle,shortText,blogDescription,"NA",userId,isPublished);
                    blogDao.saveBlog(blog);
                    resp.sendRedirect(req.getContextPath()+"/");

    }
}
