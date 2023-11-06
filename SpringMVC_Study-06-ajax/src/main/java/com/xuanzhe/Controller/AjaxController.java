package com.xuanzhe.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
  @RequestMapping("/t")
  public String test(){
    return "hello xiaxuanzhe";
  }
}
