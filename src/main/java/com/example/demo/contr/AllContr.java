package com.example.demo.contr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AllContr {

    @GetMapping("/login/ws")
    public String l() {
        return "redirect:/hello";
    }

    @GetMapping
    public String hello(@RequestParam(name = "name", defaultValue = "User") String name,
                        Model model) {
        model.addAttribute("name", name);
        return "home";
    }
}