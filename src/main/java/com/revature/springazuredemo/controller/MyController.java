package com.revature.springazuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "1")
    public String one() {
        return "This is the first page";
    }

    @GetMapping(value = "2")
    public String two() {
        return "This is the second page";
    }

    @GetMapping(value = "3")
    public String three() {
        return "This is the last page";
    }

}
