package com.atguigu.gmall.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UserBean;
import com.atguigu.gmall.user.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("index")
    @ResponseBody
    public String index(){

        //List<UserBean> userBeanList = userService.save();

        return "hello springboot3";
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        //List<UserBean> userBeanList = userService.save();
       List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;

    }
}
