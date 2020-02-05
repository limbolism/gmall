package com.ly.gmall.user.mapper;


import com.ly.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();

    int addUser(UmsMember umsMember);

    int deleteUser(String id);

    UmsMember getUserById(String id);

    int updateUserById(UmsMember umsMember);
}
