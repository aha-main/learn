package com.syw.bookadmin.service;

import com.syw.bookadmin.dao.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User getUser();
}
