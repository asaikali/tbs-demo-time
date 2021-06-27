package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String get() {
        return "Version : 1, time: " + LocalDateTime.now();
    }
}
