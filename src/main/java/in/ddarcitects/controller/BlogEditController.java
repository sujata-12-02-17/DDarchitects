package in.ddarcitects.controller;

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

@WebServlet(value ="/blogeditform")
public class BlogEditController  extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BlogDao blogDao = new BlogDaoImpl();
    private UserDao userDao = new UserDaoImpl();
    public BlogEditController() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Blog blog = null;
        Long id = Long.parseLong(req.getParameter("id"));
        if(!id.equals(0)){

            blog = blogDao.findBlogByid(id);
            List<User> users =userDao.findAllUser();
            req.setAttribute("blog",blog);
            req.setAttribute("users",users);
            req.getRequestDispatcher("blog-edit-form.jsp").forward(req,resp);
        }
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Blog blog =null;
        String id =  req.getParameter("blog-id");
        System.out.println("inside dopost.."+id);

        if(!id.isEmpty()){
            blog =blogDao.findBlogByid(Long.parseLong(id));

        }
        String blogTitle = req.getParameter("blog-title");
        String featureImageUrl =  req.getParameter("feature-UrI-Image");
        String blogDescription = req.getParameter("blog-description");
        String shortText=req.getParameter("blog-short-text");
        Long userId = Long.parseLong(req.getParameter("author"));
        boolean  isPublished= req.getParameterMap().containsValue(1);


        blog.setBlogTitle(blogTitle);
        blog.setFeatureImageUrl(featureImageUrl);
        blog.setBlogDescription(blogDescription);
        blog.setShortText(shortText);
        blog.setUserId(userId);
        blog.setPublished(isPublished);

        blogDao.updateBlog(blog);

        resp.sendRedirect(req.getContextPath()+"/blogs");
    }


}