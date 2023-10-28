package com.xuanzhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c1")
public class ControllerTest3 {
  @RequestMapping("/t3")
  public String test(Model model){
    model.addAttribute("msg","ControllerTest3");
    return "test1";
  }
}
