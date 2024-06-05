package com.example.demoGit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Ciontroller {
    @GetMapping("/get")
    public  String a(){
        return "Hello World";
    }
}
