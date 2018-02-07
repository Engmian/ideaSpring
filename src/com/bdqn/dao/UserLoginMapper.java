package com.bdqn.dao;

import com.bdqn.entity.UserLogin;
import org.apache.ibatis.annotations.Param;

public interface UserLoginMapper {
    UserLogin getSelectUserLogin(@Param("uname")String uname,@Param("upwd")String upwd);
}
