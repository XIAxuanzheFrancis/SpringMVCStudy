package com.xuanzhe.Controller;

import java.io.IOException;
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
}
