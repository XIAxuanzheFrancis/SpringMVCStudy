package com.xuanzhe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ControllerTest1 implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    ModelAndView mv = new ModelAndView();
    mv.addObject("msg", "ControllerTest1");
    mv.setViewName("test1");
    return mv;
  }
}
