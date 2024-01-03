package com.example.likelionspringbootboard.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "hi";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
