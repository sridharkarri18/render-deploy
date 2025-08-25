package com.example.render;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("hi")
    public String getMessage(){
        return "Hello World";
    }
}
