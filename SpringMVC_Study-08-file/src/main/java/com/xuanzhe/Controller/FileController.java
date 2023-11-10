package com.xuanzhe.Controller;

import java.io.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RestController
public class FileController {
  @RequestMapping("/upload")
      public String fileUpload(@RequestParam("file") CommonsMultipartFile file , HttpServletRequest request) throws IOException {
        String uploadFileName = file.getOriginalFilename();
        if ("".equals(uploadFileName)){
          return "redirect:/index.jsp";
        }
        System.out.println("Upload file name : "+uploadFileName);
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()){
          realPath.mkdir();
        }
        System.out.println("Upload the file save address:"+realPath);
        InputStream is = file.getInputStream();
        OutputStream os = new FileOutputStream(new File(realPath,uploadFileName));
        int len=0;
        byte[] buffer = new byte[1024];
        while ((len=is.read(buffer))!=-1){
          os.write(buffer,0,len);
          os.flush();
        }
        os.close();
        is.close();
        return "redirect:/index.jsp";
      }
  /*
   * file.Transto
   */
  @RequestMapping("/upload2")
  public String  fileUpload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
    String path = request.getServletContext().getRealPath("/upload");
    File realPath = new File(path);
    if (!realPath.exists()){
      realPath.mkdir();
    }

    System.out.println("Upload the file save address:"+realPath);
    file.transferTo(new File(realPath +"/"+ file.getOriginalFilename()));
    return "redirect:/index.jsp";
  }
    }
