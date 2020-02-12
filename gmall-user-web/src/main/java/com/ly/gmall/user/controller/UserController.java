package com.ly.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ly.gmall.bean.UmsMember;
import com.ly.gmall.bean.UmsMemberReceiveAddress;
import com.ly.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(@RequestParam(name = "id",required = true)String id){
        boolean b = userService.updateUserById(id);
        if (!b){
            return "failed";
        }
        return "true";
    }

    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser(@RequestParam(name = "id",required = true) String id){
        boolean b = userService.deleteUserById(id);
        if (!b){
            return "failed";
        }
        return "true";
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return userService.getReceiveAddressByMemberId(memberId);
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("addUser")
    @ResponseBody
    public String addUser(@RequestParam(name = "username", required = true) String username,
                          @RequestParam(name = "password", required = true) String password) {
        boolean b = userService.addUser(username, password);
        if (!b){
            return "failed";
        }
        return "true";
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
