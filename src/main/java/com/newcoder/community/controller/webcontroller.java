package com.newcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/alpha")
@Controller
public class webcontroller {
    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello newcoder";
    }
}
