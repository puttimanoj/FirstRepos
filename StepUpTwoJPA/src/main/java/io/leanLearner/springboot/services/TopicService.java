package io.leanLearner.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.leanLearner.springboot.Repository.TopicRepositoryIntf;
import io.leanLearner.springboot.pojos.Topic;

@Service
public class TopicService {
    @Autowired
	private TopicRepositoryIntf repository;
	
	public List<Topic> getTopics() {
		return repository.findAll();
	}

	public void setTopics(List<Topic> topics) {
		repository.saveAll(topics);
	}
	
	public Topic getTopic(String ID) {
		return repository.findByTopicID(ID).get(0);
	}
	
	public void setTopic(Topic topic) {  
		repository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		Topic topicToUpdate = repository.getOne(topic.getId());
		topicToUpdate.setTopicID(topic.getTopicID());
		topicToUpdate.setTopicName(topic.getTopicName());
		repository.save(topicToUpdate);
		return;
	}

	public void deleteTopic(String id) {
		Topic topic = repository.findByTopicID(id).get(0);
		repository.delete(topic);
	}

	public void deleteTopics() {
		repository.deleteAll() ;
	}
}

