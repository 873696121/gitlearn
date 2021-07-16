package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author HuHong
 * @date 2021/7/16
 */

@RestController
@RequestMapping("calculate")
public class DemoController {

    @GetMapping("add/{a}/{b}")
    public String add(@PathVariable Integer a, @PathVariable Integer b){
        return String.valueOf(a + b);
    }
}
