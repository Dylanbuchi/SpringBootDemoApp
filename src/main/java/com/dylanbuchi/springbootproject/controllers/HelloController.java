package com.dylanbuchi.springbootproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 */
@RestController
public class HelloController implements IRestControllers {

    @Override
    @RequestMapping("/")
    public String print() {

        return "hello";
    }

}