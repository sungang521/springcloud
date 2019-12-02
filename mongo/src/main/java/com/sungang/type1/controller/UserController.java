package com.sungang.type1.controller;

import com.sungang.type1.domain.User;
import com.sungang.type1.service.UserService;
import com.sungang.type2.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    public void saveUser(User user){
        userService.saveUser(user);
    }
    @RequestMapping(value = "/user/getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
