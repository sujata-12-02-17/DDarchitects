package in.ddarcitects.dao;

import in.ddarcitects.model.User;

import java.sql.Connection;
import java.util.List;


public interface UserDao {
    int saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User findUserById(Long id);
    List<User> findAllUser();
}
