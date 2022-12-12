package com.example.demo.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author: ligang
 * @date: 2022/11/04/ 20:22
 **/

@RestController
public class HelloController {

    private final RestTemplate restTemplate;
    public HelloController(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate=restTemplateBuilder.build();
    }

    @RequestMapping("/hello")
    public String Hello(@RequestParam String name){
        return ("你好"+name);
    }
    @RequestMapping("/hello")
    public String Hello22(@RequestParam String name){
        return ("你好"+name);
    }
    @PostMapping("/study")
    public String study(@RequestParam String book){
        return ("HelloWorld,来读这本"+book);
    }
    @GetMapping ("/say")
    public String say(@RequestParam String book){
        return ("HelloWorld,来读这本"+book);
    }
}
