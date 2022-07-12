package com.example.demo.contr;

import com.example.demo.reposytory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisContr {
    final UserRepo userRepo;

    @Autowired
    public RegisContr(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/regis")
    public String regis() {
        return "regis";
    }
}
