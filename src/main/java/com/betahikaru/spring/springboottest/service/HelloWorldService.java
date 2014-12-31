/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betahikaru.spring.springboottest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    @Value("${name:World1}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
    
    public String getHiMessage() {
        return "Hi " + this.name;
    }
}
