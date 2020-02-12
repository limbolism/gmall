package com.ly.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.gmall.bean.UmsMember;
import com.ly.gmall.bean.UmsMemberReceiveAddress;
import com.ly.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.ly.gmall.user.mapper.UserMapper;
import com.ly.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }

    @Override
    public boolean addUser(String username, String password) {
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername(username);
        umsMember.setPassword(password);

        int number = userMapper.addUser(umsMember);
        return number > 0;
    }

    @Override
    public boolean deleteUserById(String id) {
        int result =  userMapper.deleteUser(id);
        return result > 0;
    }

    @Override
    public boolean updateUserById(String id) {
        UmsMember umsMember = userMapper.getUserById(id);
        if (umsMember == null){
            return false;
        }
        umsMember.setCity("长沙");
        int result = userMapper.updateUserById(umsMember);
        return result > 0;
    }
}
