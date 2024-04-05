package com.akhil.app.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String health(){
        boolean isUp = true;
        if (isUp){
            return ("{\"Status\":\"Up\"}");
        }
        return ("{\"Status\":\"Down\"}");
    }
}
