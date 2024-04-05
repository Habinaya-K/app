package com.akhil.app.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/healthup")
    public String healthUp(){
        return ("{\"Status\":\"Up\"}");
    }

    @GetMapping("/healthdown")
    public String healthDown(){
        return ("Health is down");
    }

}
