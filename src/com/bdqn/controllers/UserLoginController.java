package com.bdqn.controllers;

import com.bdqn.entity.UserLogin;
import com.bdqn.service.UserLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("userLoginController")
public class UserLoginController {
    @Resource
    private UserLoginService userLoginService;

    @RequestMapping("/goPages")
    public String goPages(){
        return "gologin";
    }
    @RequestMapping("/goUserLogin")
    public String goUserLogin(UserLogin userLogin, RedirectAttributes redirectAttributes, HttpServletRequest request){

        UserLogin selectUserLogin = userLoginService.getSelectUserLogin(userLogin.getUname(), userLogin.getUpwd());

        if (selectUserLogin != null) {
            redirectAttributes.addFlashAttribute("Msg",userLogin.getUname());
            return "redirect:/deptController/getSelectLimitShow";
        }else {
            return "gologin";
        }
    }

}
