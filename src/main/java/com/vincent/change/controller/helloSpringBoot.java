package com.vincent.change.controller;

import com.vincent.change.entity.userinfo;
import com.vincent.change.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class helloSpringBoot {

    @Autowired
    UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/hello", method= RequestMethod.GET )
    public List index(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("pringBoot say hello!");
        mv.setViewName("hello");
        List list = new ArrayList();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/finduserinfp", method= RequestMethod.GET )
    public List<userinfo> finduserinfo(){
        List<userinfo>  list = new ArrayList<>();
        list = userInfoService.findList();
        return list;
    }
}
