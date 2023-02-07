package com.example.lesson_4_3.controllers;

import com.example.lesson_4_3.model.User;
import com.example.lesson_4_3.service.UsersServise;
import liquibase.pro.packaged.L;
import liquibase.pro.packaged.S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersControllers {
    @Autowired
    private UsersServise usersServise;

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        usersServise.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        User user = usersServise.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
        usersServise.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/name/{name}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable("name") String name) {
        List<User> users = usersServise.getUserByName(name);
        return ResponseEntity.ok(users);
    }
}
