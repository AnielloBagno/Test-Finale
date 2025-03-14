package com.festival.controller;
import com.festival.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.festival.entities.User;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    @Autowired
    private UserService userService;    

    @GetMapping("/register")
    public String showRegistration(User user) {
        return "register";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }
    
    
}
