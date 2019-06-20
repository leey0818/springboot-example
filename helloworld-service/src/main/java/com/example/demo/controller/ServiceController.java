package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ServiceController
{
     @Value("${eureka.instance.metadataMap.instanceId}")
     String instanceId;
     
     @Value("${example.hello}")
     String message;
     
     @RequestMapping("/")
     String message() {
         return this.message;
     }
     
     @RequestMapping("/id")
     String instanceId() {
         return this.instanceId;
     }
}
