package com.xuanzhe.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
  @GetMapping("t1")
  public String test(){
    System.out.println("TestController execute");
    return "ok";
  }
}
