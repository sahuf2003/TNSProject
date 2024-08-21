package com.cg.pm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepository repository;

    // Retrieve all users
    public List<User> listAll() {
        return repository.findAll();
    }

    // Retrieve a user by ID
    public User get(Integer id) {
        Optional<User> result = repository.findById(id);
        return result.orElse(null); // Return user or null if not found
    }

    // Save a new user or update an existing one
    public void save(User user) {
        repository.save(user);
    }

    // Delete a user by ID
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
