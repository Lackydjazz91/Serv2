package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/")
    public String defaultMeth() {
        return "Страница сервиса 2";
    }
}
