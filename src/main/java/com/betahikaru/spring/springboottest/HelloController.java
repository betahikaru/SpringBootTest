/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betahikaru.spring.springboottest;

import com.betahikaru.spring.springboottest.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class HelloController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return helloWorldService.getHelloMessage();
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        return helloWorldService.getHiMessage();
    }

    public static void main(String[] arguments) {
        SpringApplication.run(HelloController.class, arguments);
    }

}
