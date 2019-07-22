package com.example.springboot.entity;

import java.io.Serializable;

/**
 * @Author:yaohy
 * @Date: 2019/7/16 0026
 * @Time: 14:39
 */
public class User{
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private String phone;
    private String address;

    public String getPhone() { return phone;}

    public void setPhone(String phone) { this.phone = phone;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}