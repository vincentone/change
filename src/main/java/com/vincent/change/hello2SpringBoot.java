package com.vincent.change;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hello2SpringBoot {

    @ResponseBody
    @RequestMapping(value = "/hello2", method= RequestMethod.GET )
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("pringBoot say hello!");
        mv.setViewName("hello");
        return mv;
    }
}
