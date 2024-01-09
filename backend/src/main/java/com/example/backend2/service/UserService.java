package com.example.backend2.service;

import com.example.backend2.model.UserModel;
import com.example.backend2.repository.UserRepository;
import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserModel> getAllUser(){
        List<UserModel> users = userRepository.findAll();
        // 打印获取到的数据
        System.out.println("user:"+users);
        return users;
    }

    public Optional<UserModel> getUserById(Integer id){
        return userRepository.findById(id);
    }
}
