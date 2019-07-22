package com.example.springboot.service;

import com.example.springboot.entity.User;

public interface UserService{
    User Sel(int id);
    User GetPersonDetail(int id);
}
