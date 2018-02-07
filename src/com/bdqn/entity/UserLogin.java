package com.bdqn.entity;

import java.io.Serializable;

public class UserLogin implements Serializable {
    private String uname;
    private String upwd;
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public UserLogin(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }

    public UserLogin() {
    }
}
