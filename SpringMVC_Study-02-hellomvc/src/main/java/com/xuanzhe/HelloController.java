package com.xuanzhe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView mv = new ModelAndView();
    mv.addObject("msg","HelloSpringMVC!");
    mv.setViewName("hello");
    return mv;
  }
}