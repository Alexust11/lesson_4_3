package com.example.lesson_4_3.service;

import com.example.lesson_4_3.model.User;
import com.example.lesson_4_3.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServise {
    @Autowired
    private UsersRepository usersRepository;
    public void createUser(User user) {
        usersRepository.save(user);
    }

    public User getUserById(Integer id) {
        return usersRepository.getUserById(id);
    }

    public void deleteUserById(Integer id) {
        usersRepository.deleteById(id);
    }

    public List<User> getUserByName(String name) {
        return  usersRepository.getUserByName(name);
    }
}
