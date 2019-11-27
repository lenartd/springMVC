package com.lynas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld_form";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }
}
