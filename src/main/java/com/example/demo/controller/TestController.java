package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;

/**
 * Created by T011689 on 2018/10/25.
 */
@Controller
public class TestController {
    @RequestMapping("/center")
    public ModelAndView center(HttpSession session){
        System.out.println("forward 经过了控制器");
        System.out.println("session 过期时间:"+session.getMaxInactiveInterval());
        return  new ModelAndView("center");
    }
    @RequestMapping("/user/me")
    @ResponseBody
    public Principal user(Principal principal) {
        return principal;
    }
}
