package io.leanLearner.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import io.leanLearner.springboot.pojos.Topic;

public interface TopicRepositoryIntf extends JpaRepository<Topic, Long> {

	  List<Topic> findByTopicName(String lastName);
	  List<Topic> findByTopicID(String lastName);

	  Topic findById(long id);
	}