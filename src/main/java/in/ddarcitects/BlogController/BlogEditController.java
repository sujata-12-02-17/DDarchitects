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

public class BlogEditController  extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BlogDao blogDao = new BlogDaoImpl();

    public BlogEditController() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Blog blog =null;
        String blogId =  req.getParameter("id");

        if(!blogId.isEmpty()){
            blog =blogDao.findBlogByid(Long.parseLong(blogId));

        }
        String blogTitle = req.getParameter("blogTitle");
        String featureImageUrl =  req.getParameter("featureImageUrl");
        String blogDescription = req.getParameter("blogDescription");
        String shortText=req.getParameter("shortText");
        Long userId = Long.parseLong(req.getParameter("userId"));
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