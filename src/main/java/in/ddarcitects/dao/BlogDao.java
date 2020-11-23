package in.ddarcitects.dao;

import in.ddarcitects.model.Blog;
import in.ddarcitects.model.User;

import java.util.List;


public interface BlogDao {

    Blog saveBlog(Blog blog);
    void updateBlog(Blog blog);
    Blog findBlogByid(Long id);
    List<Blog> findAllBlog();
}
