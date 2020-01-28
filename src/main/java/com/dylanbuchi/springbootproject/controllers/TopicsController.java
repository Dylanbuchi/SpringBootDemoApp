package com.dylanbuchi.springbootproject.controllers;

import java.util.List;

import com.dylanbuchi.springbootproject.models.Topic;
import com.dylanbuchi.springbootproject.services.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Topics
 */
@RestController
public class TopicsController implements IRestControllers {

    // typical methods for a rest api

    @Autowired
    private TopicService topicService;

    @Override
    @RequestMapping("/2")
    public String print() {
        return "Every topics in here";

    }

    // Get every topics
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();

    }

    // Get the topic from id
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);

    }

    // put a new topic
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);

    }

    // update a topic by id
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);

    }

    // delete a topic by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.deleteTopic(id);

    }

}