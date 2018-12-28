package com.jnshu.service.impl;

import com.jnshu.domain.User;
import com.jnshu.mapper.UserMapper;
import com.jnshu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findUserByCondition(User user) {
        return userMapper.select(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public Boolean deleteById(long id) {
      return  userMapper.deleteById(id);
    }

    @Override
    public Boolean updateUser(User user) {
        //根据主键更新属性不为null的值
         if(userMapper.updateByPrimaryKeySelective(user)>0){
             return true;
         }
         return false;

    }

    @Override
    public Boolean insert(User user) {
       if(userMapper.insertSelective(user)>0){
           return true;
       }
       return false;
    }

    @Override
    public User selectById(long id) {
       return  userMapper.findById(id);
    }
}