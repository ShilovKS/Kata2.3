package mvc_hiber.dao;

import mvc_hiber.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> getAllUsers();
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);


}
