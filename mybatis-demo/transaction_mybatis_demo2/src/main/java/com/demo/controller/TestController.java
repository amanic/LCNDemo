package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by martea on 2018/10/10.
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String save(){
        return "index";
    }
}
