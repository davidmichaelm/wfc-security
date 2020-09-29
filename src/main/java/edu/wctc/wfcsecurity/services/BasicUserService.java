package edu.wctc.wfcsecurity.services;

import edu.wctc.wfcsecurity.entities.User;
import edu.wctc.wfcsecurity.repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicUserService implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }
    public User getUser(String username) { return usersRepository.findByUsername(username); }
}
