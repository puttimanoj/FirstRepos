package io.leanLearner.springboot.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String topicID;
	private String topicName;


	protected Topic() {}


	public Topic(String topicID, String topicName) {
		super();
		this.topicID = topicID;
		this.topicName = topicName;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}


	@Override
	public String toString() {
		return "Topic [id=" + id + ", topicID=" + topicID + ", topicName=" + topicName + "]";
	}


	public Long getId() {
		return id;
	}


	public String getTopicID() {
		return topicID;
	}


	public String getTopicName() {
		return topicName;
	}
	
		
}
