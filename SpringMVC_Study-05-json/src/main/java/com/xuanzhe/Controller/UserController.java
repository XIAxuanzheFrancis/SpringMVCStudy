package com.xuanzhe.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xuanzhe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
  @RequestMapping("/j1")
  @ResponseBody
  public String json1() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    User user = new User("夏烜哲xiaxuanzhe",22,"男");
    System.out.println(user.toString());
    String str = mapper.writeValueAsString(user);
    return str;
  }
}

