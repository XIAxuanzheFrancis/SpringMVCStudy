package com.xuanzhe.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xuanzhe.pojo.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

  //  @RequestMapping(value = "/j1", produces = "application/json;charset=utf-8")
  @RequestMapping("/j1")
  @ResponseBody
  public String json1() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    User user = new User("夏烜哲xiaxuanzhe", 22, "男");
    System.out.println(user.toString());
    String str = mapper.writeValueAsString(user);
    return str;
  }

  @RequestMapping("/j2")
  @ResponseBody
  public String json2() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    List<User> userList = new ArrayList<User>();
    User user = new User("夏烜哲xiaxuanzhe", 22, "男");
    User user2 = new User("夏烜哲xiaxuanzhe2", 22, "男");
    User user3 = new User("夏烜哲xiaxuanzhe3", 22, "男");
    User user4 = new User("夏烜哲xiaxuanzhe4", 22, "男");

    userList.add(user);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);

    //System.out.println(user.toString());
    String str = mapper.writeValueAsString(userList);
    return str;
  }
 @RequestMapping("/j3")
 @ResponseBody
  public String jsom3() throws JsonProcessingException {
   Date date = new Date();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    ObjectMapper mapper = new ObjectMapper();
    String str = mapper.writeValueAsString(sdf.format(date));
    return str;
  }

}

