package com.example.Web1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Web1")
    public String index() {
        return "Running Fine on the other port";
    }



}