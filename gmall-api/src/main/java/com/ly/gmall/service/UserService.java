package com.ly.gmall.service;


import com.ly.gmall.bean.UmsMember;
import com.ly.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    boolean addUser(String username, String password);

    boolean deleteUserById(String id);

    boolean updateUserById(String id);
}
