package com.syw.bookadmin.service.iml;

import com.syw.bookadmin.dao.User;
import com.syw.bookadmin.mapper.UserMapper;
import com.syw.bookadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceIml implements UserService {

    @Autowired
    public UserMapper users;

    @Override
    public User getUser() {
        return users.getUsers();
    }
}
