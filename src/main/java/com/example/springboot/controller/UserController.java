package com.example.springboot.controller;


import com.example.springboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:yaohy
 * @Date: 2019/7/19 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }
    @RequestMapping("getUserDetail/{id}")
    public String GetPersonDetail(@PathVariable int id){
        return userService.GetPersonDetail(id).toString();
    }
}