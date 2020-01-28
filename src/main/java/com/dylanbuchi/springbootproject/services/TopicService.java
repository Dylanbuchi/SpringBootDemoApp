package com.dylanbuchi.springbootproject.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dylanbuchi.springbootproject.models.Topic;

import org.springframework.stereotype.Service;

/**
 * TopicService
 */

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("1", "Java", "Best programming language"),
            new Topic("2", "Spring", "Best framework"), new Topic("3", "Flutter", "Create apps really fast"),
            new Topic("4", "Python", "Easy programming language")));

    public List<Topic> getAllTopics() {
        return topics;

    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {

        for (int i = 0; i < topics.size(); i++) {

            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }

        }

    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }

}