package in.ddarcitects.daoImpl;

import in.ddarcitects.dao.BlogDao;
import in.ddarcitects.model.Blog;
import in.ddarcitects.model.User;
import in.ddarcitects.util.DbConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BlogDaoImpl implements BlogDao {


    public Blog saveBlog(Blog blog) {
        String str = "";
        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();
        int flag = 0;
        if (con != null) {
            try {
                PreparedStatement ps = con.prepareStatement("insert into blog (blogTitle,url,blogDescription,shortText,user_id,isPublished)VALUES(?,?,?,?,?,?)");
                ps.setString(1, blog.getBlogTitle());
                ps.setString(2, blog.getFeatureImageUrl());
                ps.setString(3, blog.getBlogDescription());
                ps.setString(4, blog.getShortText());
                 ps.setLong(5,blog.getUserId());
                ps.setString(6, "0");
                if (ps.executeUpdate() == 1) {
                    flag = 1;
                }
                con.close();


            } catch (SQLException e) {

                e.printStackTrace();
            }

        }

        return blog;
    }

    @Override
    public void updateBlog(Blog blog) {
        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();
        if (con != null) {
            System.out.println("blog.getId().."+ blog.getId());
            try {
                PreparedStatement ps = con.prepareStatement("update blog set blogTitle=?,url=?,blogDescription=?,shortText=?, user_Id=? where id=?");
                ps.setString(1, blog.getBlogTitle());
                ps.setString(2, blog.getFeatureImageUrl());
                ps.setString(3, blog.getBlogDescription());
                ps.setString(4, blog.getShortText());
                ps.setLong(5,blog.getUserId());
                ps.setLong(6, blog.getId());
                ps.executeUpdate();
                ps.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public Blog findBlogByid(Long id) {
        Blog blog=new Blog();
        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();

        if (con != null) {
            try {
                PreparedStatement st = con.prepareStatement("select * from blog where id=?");
                {
                    st.setLong(1, id);
                    ResultSet rs=st.executeQuery();{
                    if(rs.next()){

                        blog.setId(rs.getLong(1));
                        blog.setBlogTitle(rs.getString(2));
                        blog.setFeatureImageUrl(rs.getString(3));
                        blog.setBlogDescription(rs.getString(4));
                        blog.setShortText(rs.getString(5));
                        blog.setUserId(rs.getLong(6));
                        blog.setPublished(rs.getBoolean(7));


                    }
                }


                    con.close();
                }

            } catch (SQLException e3) {
                e3.printStackTrace();
            }

        }
        return blog;


    }

    @Override
    public List<Blog> findAllBlog() {
        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();
        List<Blog> blogs = new ArrayList<Blog>();
        if (con != null) {
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * from blog");
                while (rs.next()) {
                    Blog blog = new Blog(rs.getLong("id"), rs.getString("blogTitle"), rs.getString("url"), rs.getString("blogDescription"),rs.getString("shortText"), rs.getLong("user_Id"), rs.getBoolean("isPublished"));
                    blogs.add(blog);
                }

                con.close();

            } catch (SQLException e4) {

                e4.printStackTrace();
            }
        }
        return blogs;
    }

    @Override
    public int CountBlog() {
        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();
        int blogCount=0;
        if(con!=null){
            try{

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select count(*) from blog;");
                while (rs.next()){
                    blogCount= rs.getInt(1);
                }
                con.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return blogCount;
    }



}



