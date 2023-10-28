package com.xuanzhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerTest4 {
  //@RequestMapping("/add")
  @PostMapping("/add/{a}/{b}")
  public String test(@PathVariable String a, @PathVariable int b, Model model){
    String res = a + b;
    model.addAttribute("msg","a+b="+ res);
    return "test1";
  }
  @GetMapping("/add/{a}/{b}")
  public String test2(@PathVariable int a, @PathVariable int b, Model model){
    int res = a + b;
    model.addAttribute("msg","a+b="+ res);
    return "test1";
  }

}
