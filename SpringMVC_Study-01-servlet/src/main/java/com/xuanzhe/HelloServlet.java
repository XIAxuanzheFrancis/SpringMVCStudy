package com.xuanzhe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    //1.Get front-end parameters 2.Call business layer 3.View forwarding and redirection
    String method = req.getParameter("method");
    if(method.equals("add")){
      req.getSession().setAttribute("msg","executer le méthode Add");
    }
    if(method.equals("delete")){
      req.getSession().setAttribute("msg","executer le méthode Delete");
      //resp.sendRedirect();
    }
    req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    doGet(req, resp);
  }
}
