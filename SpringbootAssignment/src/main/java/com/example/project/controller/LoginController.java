package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("login-form");
        return modelAndView;
    }

}
