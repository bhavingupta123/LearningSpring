package com.example.springbootweb1;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpSession session){
        session.setAttribute("message", "sent a message from add endpoint");
        return "index.jsp";
    }
}
