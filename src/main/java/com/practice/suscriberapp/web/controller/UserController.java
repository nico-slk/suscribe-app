package com.practice.suscriberapp.web.controller;

import com.practice.suscriberapp.persistence.entity.User;
import com.practice.suscriberapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/name/{user_name}")
    public ResponseEntity<User> getUserByName(@PathVariable String user_name) {
        return ResponseEntity.ok(userService.getUserByName(user_name));
    }

    @GetMapping("/id/{id_user}")
    public ResponseEntity<User> getUserByName(@PathVariable UUID id_user) {
        return ResponseEntity.ok(userService.getUserById(id_user));
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

}
