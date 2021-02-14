package io.leanLearner.springboot;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.leanLearner.springboot.Repository.TopicRepositoryIntf;
import io.leanLearner.springboot.pojos.Topic;

@SpringBootApplication
public class MainApp {
	private static final Logger log = 
			org.slf4j.LoggerFactory.getLogger(MainApp.class);
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args) ;
	}

	@Bean
	  public CommandLineRunner demo(TopicRepositoryIntf repository) {
	    return (args) -> {
	      // save a few customers
	      repository.save(new Topic("Jack", "Bauer"));
	      repository.save(new Topic("Chloe", "O'Brian"));
	      repository.save(new Topic("Kim", "Bauer"));
	      repository.save(new Topic("David", "Palmer"));
	      repository.save(new Topic("Michelle", "Dessler"));

	      // fetch all Topics
	      log.info("Topics found with findAll():");
	      log.info("-------------------------------");
	      for (Topic topic : repository.findAll()) {
	        log.info(topic.toString());
	      }
	      log.info("");

	      // fetch an individual topic by ID
	      Topic topic = repository.findById(1L);
	      log.info("Topic found with findById(1L):");
	      log.info("--------------------------------");
	      log.info(topic.toString());
	      log.info("");

	      // fetch topics by last name
	      log.info("Topic found with findByLastName('Bauer'):");
	      log.info("--------------------------------------------");
	      repository.findByTopicName("Bauer").forEach(bauer -> {
	        log.info(bauer.toString());
	      });
	      // for (Topic bauer : repository.findByLastName("Bauer")) {
	      //  log.info(bauer.toString());
	      // }
	      log.info("");
	    };
	  }

}
