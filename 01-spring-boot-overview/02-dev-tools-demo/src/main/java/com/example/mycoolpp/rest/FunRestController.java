package com.example.mycoolpp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // first endpoint

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5 k";
    }


}
