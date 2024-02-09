package com.practice.suscriberapp.service;

import com.practice.suscriberapp.persistence.entity.User;
import com.practice.suscriberapp.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserByName(String user_name) {
        return userRepository.findByName(user_name);
    }

    public User getUserById(UUID idUser) {
        return userRepository.findById(idUser).orElseThrow(
                () -> new RuntimeException("User with ID: " + idUser + " was not found.")
        );
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}
