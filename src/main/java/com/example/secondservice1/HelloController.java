package com.example.secondservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
public class HelloController {

    @GetMapping("")
    public String test(){
        return "second Service!!!";
    }
}
