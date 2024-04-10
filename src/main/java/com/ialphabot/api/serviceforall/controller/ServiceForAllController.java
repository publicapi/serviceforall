package com.ialphabot.api.serviceforall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceForAllController {

@GetMapping("/myvalue")
    public String getServiceValue(){
        return "welcome";
    }
}
