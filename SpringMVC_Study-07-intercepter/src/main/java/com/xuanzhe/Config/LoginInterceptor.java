package com.xuanzhe.Config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    if(request.getRequestURI().contains("tologin")){
      return true;
    }
    if(request.getRequestURI().contains("login")){
      return true;
    }
    if(request.getSession().getAttribute("userLoginInfo")!=null){
      return true;
    }
    request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
   return false;
  }
}
