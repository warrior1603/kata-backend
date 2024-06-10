package com.example.foobarquix.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.foobarquix.api.service.KataService;

@RestController
@RequestMapping("/api")
public class FooBarQuixController {

    @Autowired
    private KataService kataService;

    @GetMapping("/transform/{number}")
    public String transformNumber(@PathVariable int number) {
        return kataService.transformNumber(number);
    }
}
