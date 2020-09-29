package edu.wctc.wfcsecurity.services;

import edu.wctc.wfcsecurity.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(String username);
}
