package com.example.useradmin;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import cn.hutool.crypto.SecureUtil;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.example.useradmin.mapper.UserMapper;
import com.example.useradmin.model.User;
import com.example.useradmin.service.UserService;
import com.example.useradmin.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@SpringBootTest
class UserAdminApplicationTests {



    @Autowired
    UserServiceImpl userService = new UserServiceImpl();
    @Test
    public void testSelect() {

//     User user =   userService.userLogin("aabbcc", "12345678", null);
//System.out.println(user);



    }

    @Test
    public void testSearchUserByTag() {
        List<String> tagnameList = Arrays.asList("java", "python");
        List<User> userlist = userService.searchUserByTag(tagnameList);
        Assert.notNull(userlist, "用户列表为空");
        System.out.println(userlist);

    }

}
