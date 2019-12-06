package com.springMVC.mySpringMVC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class MyController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "main-menu";
    }
}
