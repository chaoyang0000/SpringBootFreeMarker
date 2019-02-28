package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("index")
   public ModelAndView index(ModelAndView modelAndView) {
    modelAndView.setViewName("index");
    modelAndView.addObject("name", "gjf");
    modelAndView.addObject("age", "18");
     return modelAndView;
  }
}
