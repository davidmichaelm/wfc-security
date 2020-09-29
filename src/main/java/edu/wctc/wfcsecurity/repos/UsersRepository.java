package edu.wctc.wfcsecurity.repos;

import edu.wctc.wfcsecurity.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<User, String> {
    List<User> findAll();
    User findByUsername(String username);
}
