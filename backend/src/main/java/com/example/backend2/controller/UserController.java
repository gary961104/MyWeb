package com.example.backend2.controller;
import com.example.backend2.model.UserModel;
import com.example.backend2.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser")
    public List<UserModel> getUser(){
        List<UserModel> users = userService.getAllUser();
        // 打印获取到的数据
        System.out.println("user:"+users);
        return users;
    }

    @GetMapping(value = "/test")
    public void tset(String t, String s){
        B test = new B();
    }

}
