package com.springwebapp.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("home/")
public class WebController {

    @RequestMapping("home1")
    public String home()
    {
        System.out.println("HELLO ITS JSP PAGE");
        return "index";
    }
}
