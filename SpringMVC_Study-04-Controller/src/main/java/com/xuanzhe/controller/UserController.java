package com.xuanzhe.controller;

import com.xuanzhe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
  @GetMapping("/t1")
  public String test(@RequestParam("username") String name, Model model){
    System.out.println("username"+name);
    model.addAttribute("msg",name);
    return "test1";
  }
  @GetMapping("/t2")
  public String test2(User user){
    System.out.println(user);
    return "test1";
  }
}
