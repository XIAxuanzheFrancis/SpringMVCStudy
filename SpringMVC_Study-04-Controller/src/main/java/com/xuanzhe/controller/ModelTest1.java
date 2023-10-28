package com.xuanzhe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
  @RequestMapping("m1/t1")
  public String test(HttpServletRequest req, HttpServletResponse resp){
    HttpSession session = req.getSession();
    System.out.println(session.getId());
    return "redirect:/index.jsp";

  }
}
