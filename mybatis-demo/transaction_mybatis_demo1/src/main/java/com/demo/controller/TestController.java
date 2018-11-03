package com.demo.controller;

import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lorne on 2017/7/6.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("i") Integer i){
        String s = testService.hello(i);
        return s;

    }



    @RequestMapping("/hello")
    @ResponseBody
    public String hello(Model model){
        return "index";
    }
}
