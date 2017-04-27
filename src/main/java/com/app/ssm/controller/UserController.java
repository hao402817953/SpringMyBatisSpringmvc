package com.app.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.app.ssm.domain.User;
import com.app.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/26.
 */
@Service
@RequestMapping("/user")
public class UserController {

    //在后台输出
    private static Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/view.json", method = RequestMethod.GET)
    public void test1() {
        System.out.println("JINRU");
        System.out.println(userService);
        User user = null;
        try {
            user = userService.getUserById(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSONString(user));
        logger.info(JSON.toJSONString(user));
    }

}
