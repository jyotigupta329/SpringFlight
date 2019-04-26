package com.cognizant.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String testingRout(){
        return "This Rout Works";
    }



}

