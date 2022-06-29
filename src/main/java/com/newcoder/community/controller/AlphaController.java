package com.newcoder.community.controller;

import com.newcoder.community.service.AlphaService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AlphaController {
    @Autowired
    AlphaService alphaService;

    @RequestMapping("select")
    @ResponseBody
    public String select(){
        return  alphaService.select();
    }
    @RequestMapping("http")
    public void http(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getMethod());
        System.out.println(response);
        response.setContentType("text/html;charset=utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.write("<a>牛客网<a>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @GetMapping("getAlpha/{id}")
    @ResponseBody
    public String getAlpha(@RequestParam(name = "name", required = false, defaultValue = "zhangsan") String name,
                           @PathVariable(name = "id") int id){
        System.out.println(name);
        System.out.println(id);
        return "s student";
    }
    @RequestMapping(path = "student", method = RequestMethod.POST)
    public String student(String name, String age, Model model){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "demo/student";
    }
    @GetMapping("getEmp")
    @ResponseBody
    public Map<String, Object> getEmp(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张文");
        map.put("年龄", "24");
        return map;


    }

}

