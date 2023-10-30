package com.xuanzhe.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xuanzhe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerJSON {
    @ResponseBody
    @RequestMapping("/json1")
    public String json1() throws JsonProcessingException {
      ObjectMapper mapper = new ObjectMapper();
      User user = new User(1, "夏烜哲", 20);
      String str = mapper.writeValueAsString(user);
      return str;
    }
  }


