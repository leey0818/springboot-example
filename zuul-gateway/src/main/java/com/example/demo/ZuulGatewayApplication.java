package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulGatewayApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }

    @Bean
    public SimplePreFilter simplePreFilter()
    {
        return new SimplePreFilter();
    }
    
    @Bean
    public SimplePostFilter simplePostFilter()
    {
        return new SimplePostFilter();
    }
}
