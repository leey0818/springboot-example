package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceController {

    @Value("${eureka.instance.metadataMap.instanceId}")
    String instanceId;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String message() {
        return "hello!";
    }
    
    @RequestMapping("/id")
    String instanceId() {
        return this.instanceId;
    }
}
