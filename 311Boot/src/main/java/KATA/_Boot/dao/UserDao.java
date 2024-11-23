package KATA._Boot.dao;




import org.apache.catalina.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    User updateUser(User user);

    User getById(Long id);
}