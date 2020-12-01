package com.example.internetprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
    @RequestMapping("/api")
    public String mainPage() {return "index.html"; }

    @RequestMapping("/all_tariffs")
    public String userPage() {return "tariffs/index.html"; }
}
