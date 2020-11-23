package in.ddarcitects.daoImpl;

import in.ddarcitects.dao.UserDao;
import in.ddarcitects.model.User;
import in.ddarcitects.util.DbConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl  implements UserDao {



    @Override
    public int saveUser(User user) {
            DbConnectionUtil dbConnectionUtil=new DbConnectionUtil();
            Connection con=dbConnectionUtil.getConnection();
            int flag=0;
            if(con!=null){
                try{
                    PreparedStatement ps=con.prepareStatement("insert into user(firstName,lastName,email,user_Role,password,isActive) VALUES(?,?,?,?,?,?)");
                    ps.setString(1,user.getfName());
                    ps.setString(2,user.getlName());
                    ps.setString(3,user.getEmailId());
                    ps.setString(4,user.getUserRole());
                    ps.setString(5,user.getPassword());
                    ps.setString(6,"0");
                    if(ps.executeUpdate()==1){
                        flag=1;
                    }
                    con.close();

                }catch(SQLException e) {

                    e.printStackTrace();
                }

            }
            return flag;
        }

    @Override
    public void updateUser(User user) {
        DbConnectionUtil dbConnectionUtil=new DbConnectionUtil();
        Connection con=dbConnectionUtil.getConnection();
        if(con!=null){
            try{
                PreparedStatement ps=con.prepareStatement("update user set firstName=?,lastName=?,email=?,user_Role=?,password=? where id=?");
                    ps.setString(1,user.getfName());
                    ps.setString(2,user.getlName());
                    ps.setString(3,user.getEmailId());
                    ps.setString(4,user.getUserRole());
                    ps.setString(5,user.getPassword());
                    ps.setLong(6,user.getId());
                System.out.println(ps.executeUpdate());
                    con.close();


                }catch (SQLException e1){

                e1.printStackTrace();
            }



        }

    }

    @Override
    public void deleteUser(Long id) {

        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();
        if (con != null) {
            try {
                PreparedStatement st = con.prepareStatement("delete from user where id=?");
                {
                    st.setLong(1, id);

                    st.executeUpdate();
                    con.close();
                }

            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }

    }

    @Override
    public User findUserById(Long id) {

        User user=new User();
        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();

        if (con != null) {
            try {
                PreparedStatement st = con.prepareStatement("select * from user where id=?");
                {
                    st.setLong(1, id);
                    ResultSet rs=st.executeQuery();{
                    if(rs.next()){

                        user.setId(rs.getLong(1));
                        user.setfName(rs.getString(2));
                        user.setlName(rs.getString(3));
                        user.setEmailId(rs.getString(4));
                        user.setUserRole(rs.getString(5));
                        user.setPassword(rs.getString(6));
                        user.setIsActive(rs.getBoolean(7));


                    }
                }


                    con.close();
                }

            } catch (SQLException e3) {
                e3.printStackTrace();
            }

        }
        return user;

    }

    @Override
    public List<User> findAllUser() {

        DbConnectionUtil dbConnectionUtil = new DbConnectionUtil();
        Connection con = dbConnectionUtil.getConnection();
        List<User> users = new ArrayList<User>();
        if (con != null) {
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * from user");
                while (rs.next()) {
                    User user = new User(rs.getLong("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"),rs.getString("user_Role"),rs.getString("password"),rs.getBoolean("isActive"));
                    users.add(user);
                }

                con.close();

            } catch (SQLException e4) {

                e4.printStackTrace();
            }
        }
        return users;
    }

    }

