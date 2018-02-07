package com.bdqn.service.impl;

import com.bdqn.dao.UserLoginMapper;
import com.bdqn.entity.UserLogin;
import com.bdqn.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("UserLoginServiceImpl")
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private UserLoginMapper userLoginMapper;
    @Override
    public UserLogin getSelectUserLogin(String uname, String upwd) {
        return userLoginMapper.getSelectUserLogin(uname,upwd);
    }
}
