package com.xuanzhe.Controller;

import com.xuanzhe.pojo.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
  @RequestMapping("/t")
  public String test(){
    return "hello xiaxuanzhe";
  }
  @RequestMapping("/a")
  public void a(String name, HttpServletResponse resp) throws IOException {
    System.out.println("a:param=>"+name);
    if("xiaxuanzhe".equals(name)){
      resp.getWriter().print("true");
    }else{
      resp.getWriter().print("false");
    }
  }

  @RequestMapping("/a2")
  public List<User> a2(){
    List<User> userList = new ArrayList<User>();
    userList.add(new User("xiaxuanzhe",22,"man"));
    userList.add(new User("xiaxuanzhe2",22,"man"));
    userList.add(new User("xiaxuanzhe3",22,"man"));
    return userList;
  }
}
