package com.example.demo.helloContraler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}