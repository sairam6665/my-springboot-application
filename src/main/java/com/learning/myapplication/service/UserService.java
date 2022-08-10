package com.learning.myapplication.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserService {
    public String getMessage() {
        return "This is my learning Application";
    }
}
