package com.ly.gmall.user.service;


import com.ly.gmall.user.bean.UmsMember;
import com.ly.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    boolean addUser(String username, String password);

    boolean deleteUserById(String id);

    boolean updateUserById(String id);
}
