package com.example.ProductDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class ProductDetailsController {

    @Autowired
    private AuthenticationManagerBuilder builder;

    @GetMapping("/test")
    public String test(){
        builder.

        return
    }
}
