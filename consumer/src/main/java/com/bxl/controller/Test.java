package com.bxl.controller;

import com.bxl.dubborpc.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2019/4/9.
 */

@RestController
public class Test {

    @Autowired
    SayService sayService;

    @RequestMapping("/hello")
    public String say(@RequestParam("name") String name) {
        return sayService.say(name);
    }

}
