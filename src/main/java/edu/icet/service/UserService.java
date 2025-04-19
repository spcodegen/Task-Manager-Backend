package edu.icet.service;

import edu.icet.dto.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUserById(Integer id);
    User getUserByName(String name);
    List<User> getaAll();
    void updateUser(User user);
    void deleteUser(Integer id);
}
