package com.groupone.gohr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * className:LoginController
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-20 12:12
 */
@RequestMapping("/login")
@Controller
public class LoginController {
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }
}
