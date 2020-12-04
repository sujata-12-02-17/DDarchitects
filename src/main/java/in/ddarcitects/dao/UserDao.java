package in.ddarcitects.dao;

import in.ddarcitects.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public interface UserDao {
    int saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User findUserById(Long id);
    List<User> findAllUser();
    int CountUser();
    User checkLogin(String email,String password) throws SQLException;

}
