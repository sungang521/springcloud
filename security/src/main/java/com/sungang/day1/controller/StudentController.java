package com.sungang.day1.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping  ("/test")
    public String test(@Valid  A a){
        return a.getName();
    }
}
