package com.groupone.gohr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * className:IndexController
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-14 08:39
 */
@RequestMapping("/index")
@Controller
public class IndexController {
    @RequestMapping("/toIndex")
    public String toIndex(){
        /*InetAddress localHost = InetAddress.getLocalHost();
        String ip = localHost.getHostAddress();获取登陆IP地址*/
        return "index";
    }
}
