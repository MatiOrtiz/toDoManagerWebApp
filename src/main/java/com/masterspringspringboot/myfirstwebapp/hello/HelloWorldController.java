package com.masterspringspringboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

  /*  @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb= new StringBuffer();
        sb.append("<html>");
        sb.append("<title>");
        sb.append("My WebApp");
        sb.append("</title>");
        sb.append("<body>");
        sb.append("HTML page with JSP");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    @RequestMapping("say-hello")
    public String sayHello(){
        return "Good day! Beautiful morning, no?";
    }
   */

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }

}
