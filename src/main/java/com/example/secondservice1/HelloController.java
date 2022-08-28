package com.example.secondservice1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class HelloController {

    @Autowired
    Environment env;


    @GetMapping("")
    public String test(){
        return "second Service!!!";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request){
        log.info("SAerver prot ={}",request.getServerPort());

        return String.format("Hi, there. This is a message from First Service on PORT %s", env.getProperty("local.server.port"));

    }
}
















