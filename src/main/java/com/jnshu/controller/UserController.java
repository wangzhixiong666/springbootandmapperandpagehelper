package com.jnshu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.domain.User;
import com.jnshu.service.impl.UserServiceImpl;
import com.jnshu.untils.CodeMsg;
import com.jnshu.untils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr_Wang
 */
@RestController
public class UserController {
    @Resource
    UserServiceImpl userService;
    /**
     * 增加学生数据
     * @param user
     * @return Result
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Result add(@RequestBody User user ){
        boolean flag=userService.insert(user);
        if(flag){
            return Result.success();
        }
        return  Result.error(CodeMsg.SERVER_ERROR);
    }


    /**
     * 按照id删除学生数据
     * @param  id
     * @return Result
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable ("id")long id){
        if(userService.deleteById(id)){
            return  Result.success();
        }
        return  Result.error(CodeMsg.SERVER_ERROR);
    }


    @RequestMapping(value ="/user",method = RequestMethod.PUT)
    public  Result update(@RequestBody User user){
        if(userService.updateUser(user)){
            return  Result.success();
        }
        return   Result.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Result select(@RequestBody User user,@RequestParam(defaultValue = "1",required = true,value = "pageNo")Integer pageNo){
        Integer pageSize=5;
        PageHelper.startPage(pageNo,pageSize);
        List<User> teacherList=userService.findUserByCondition(user);
        if(teacherList!=null){
            PageInfo pageInfo=new PageInfo(teacherList);
            return Result.success(pageInfo);
        }
        return Result.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public Result select(){
        List<User> teacherList=userService.findAll();
        if(teacherList!=null){
            return Result.success(teacherList);
        }
        return Result.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Result select(@PathVariable("id")long id){
        User teacher=userService.selectById(id);
        if(teacher!=null){
            return Result.success(teacher);
        }
        return Result.error(CodeMsg.SERVER_ERROR);
    }
}