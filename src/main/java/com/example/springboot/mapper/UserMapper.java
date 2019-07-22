package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author:yaohy
 * @Date: 2019/7/19 0026
 * @Time: 14:42
 */
@Repository
public interface UserMapper {
    User Sel(int id);
    User GetPersonDetail(int id);
}
