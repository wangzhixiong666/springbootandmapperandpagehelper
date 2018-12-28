package com.jnshu.service;


import com.jnshu.domain.User;

import java.util.List;


public interface UserService {
    List<User> findUserByCondition(User user);
    List<User> findAll();
    Boolean deleteById(long id);
    Boolean updateUser(User user);
    Boolean insert(User user);
    User selectById(long id);
}