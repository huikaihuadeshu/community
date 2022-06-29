package com.newcoder.community.controller;

import com.newcoder.community.entity.Disscusspost;
import com.newcoder.community.entity.Page;
import com.newcoder.community.entity.User;
import com.newcoder.community.service.DisscusspostService;
import com.newcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private DisscusspostService disscusspostService;

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(Model model, Page page){
        page.setRows(disscusspostService.findDisscussRows(0));
        page.setPath("/index");
        List<Disscusspost> disscussPosts = disscusspostService.findDisscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> list = new ArrayList<>();
        if(disscussPosts != null){
            for(Disscusspost post : disscussPosts){
                Map<String, Object> map = new HashMap<>();
                map.put("post", post);
                User user = userService.findUser(post.getUserid());
                map.put("user", user);
                list.add(map);
            }
        }
        model.addAttribute("mylist", list);
        return "/index";
    }
}
