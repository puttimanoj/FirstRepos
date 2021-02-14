package io.leanLearner.springboot.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.leanLearner.springboot.pojos.Topic;

@Service
public class TopicService {
    
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java8", "Java"),
			new Topic("JavascriptES6", "JavaScript")));

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	public Topic getTopic(String ID) {
		return topics.stream().filter(s -> s.getTopicID().equals(ID)).findFirst().get();
	}
	
	public void setTopic(Topic topic) {  
		this.topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i=0; i < topics.size(); i++) {
			if(topics.get(i).getTopicID().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		return;
	}

	public void deleteTopic(String id) {
		Topic topic = topics.stream().filter(s -> s.getTopicID().equals(id)).findFirst().get();
		topics.remove(topic);
	}
}

