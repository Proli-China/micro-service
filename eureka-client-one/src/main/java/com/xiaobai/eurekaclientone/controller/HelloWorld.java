package com.xiaobai.eurekaclientone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijiansheng
 * @projectName micro-service
 * @Description todo
 * @Date 2019/5/2110:30
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/")
    public String HelloWorld(){

        return "hello first client";
    }

}
