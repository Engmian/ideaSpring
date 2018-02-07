package com.bdqn.service;

import com.bdqn.entity.UserLogin;

public interface UserLoginService {
    UserLogin getSelectUserLogin(String uname,String upwd);
}
