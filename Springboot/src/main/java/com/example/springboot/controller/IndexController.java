package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping("/login")
    public String string(@RequestParam("username") String username, @RequestParam("password") String password,
                         Model model, HttpSession session) {
//业务逻辑
        if (username != null && "2825097536".equals(password)) {
            session.setAttribute("password", username);
            session.setAttribute("username",username);
            return "redirect:main.html";
        }
        else
        model.addAttribute("msg", "用户名账号或密码错误");
        return "index";
    }
}
