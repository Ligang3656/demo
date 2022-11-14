package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: ligang
 * @date: 2022/11/04/ 20:22
 **/

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(@RequestParam String name){
        return ("你好"+name);
    }
    @PostMapping("/study")
    public String study(@RequestParam String book){
        return ("HelloWorld,来读这本"+book);
    }
}
