package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;

    }


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
