package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.UserDO;
import com.example.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUser")
    public void getUser() {
//        log.info(String.valueOf(userService.getUsers()));
        log.info("test");
    }
    
}
