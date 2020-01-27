package com.dylanbuchi.springbootproject.controllers;

import java.util.Arrays;
import java.util.List;

import com.dylanbuchi.springbootproject.models.Topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Topics
 */
@RestController
public class TopicsController implements IRestControllers {

    @Override
    @RequestMapping("/2")
    public String print() {
        return "Every topics in here";

    }

    @RequestMapping("/topics")
    public List<Topic> printTopics() {
        return Arrays.asList(new Topic("1", "Java", "Best programming language"),
                new Topic("2", "Spring", "Best framework"), new Topic("3", "Flutter", "Create apps really fast"),
                new Topic("4", "Python", "Easy programming language"));

    }

}