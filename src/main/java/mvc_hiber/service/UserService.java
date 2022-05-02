package mvc_hiber.service;

import mvc_hiber.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> getAllUsers();
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);

}
