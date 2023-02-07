package com.example.lesson_4_3.repository;

import com.example.lesson_4_3.model.User;
import liquibase.pro.packaged.S;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> getUserByName(String name);

    User getUserById(Integer id);
}
