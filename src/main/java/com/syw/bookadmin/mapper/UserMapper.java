package com.syw.bookadmin.mapper;

import com.syw.bookadmin.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User getUsers();
}
