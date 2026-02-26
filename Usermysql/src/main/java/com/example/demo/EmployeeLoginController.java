package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmployeeLoginController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String validateLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        Employee emp = service.login(username, password);

        if (emp != null) {
            model.addAttribute("username", emp.getUsername());
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "login";
        }
    }
}