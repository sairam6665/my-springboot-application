package com.learning.myapplication.controller;

import com.learning.myapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/employee")
public class ApplicationController {
    @Autowired
    private UserService userService;

    @GetMapping("/message")
    public String getMessage(){
        try{
            return userService.getMessage();
        }catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }
        return null;
    }
}
