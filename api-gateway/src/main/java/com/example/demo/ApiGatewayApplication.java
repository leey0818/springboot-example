package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.demo.filter.SimplePreFilter;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public SimplePreFilter simplePreFilter()
    {
        return new SimplePreFilter();
    }

}
