package com.jnshu;

import com.jnshu.domain.User;
import com.jnshu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootandmapperandpagehelperApplicationTests {
    @Resource
    UserServiceImpl userService;

    @Test
    public void test() {
        User user=new User();
        user.setUsername("user");
        System.out.println(userService.findUserByCondition(user).toString());
    }
}

