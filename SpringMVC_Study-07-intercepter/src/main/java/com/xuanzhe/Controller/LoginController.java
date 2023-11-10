package com.xuanzhe.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {
  @RequestMapping("/main")
  public String toMain(){
    return "main";
  }
  @RequestMapping("/tologin")
  public String toLogin(){
    return "login";
  }
  @RequestMapping("/login")
  public String login(HttpSession session, String username,String password, Model model){
    session.setAttribute("userLoginInfo",username);
    model.addAttribute("userLoginInfo",username);
    return "main";
  }
  @RequestMapping("/logout")
  public String logout(HttpSession session){
    session.removeAttribute("userLoginInfo");
    return "main";
  }
}
