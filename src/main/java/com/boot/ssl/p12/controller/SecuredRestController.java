package com.boot.ssl.p12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/ssl")
public class SecuredRestController {

    @GetMapping
    public String securedURL(){
        return "secured handshake";
    }
}
