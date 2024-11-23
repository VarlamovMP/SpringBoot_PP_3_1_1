package KATA._Boot.service;


import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(Long id, User user);

    User getById(Long id);
}