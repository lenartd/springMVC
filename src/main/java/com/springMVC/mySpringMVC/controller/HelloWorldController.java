package com.springMVC.mySpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormV2(HttpServletRequest request, Model model){

        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Yo! " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormV3(@RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();
        String result = "Boii "+theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

}
