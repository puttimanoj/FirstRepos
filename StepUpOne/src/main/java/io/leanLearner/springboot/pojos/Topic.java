package io.leanLearner.springboot.pojos;

public class Topic {

	private String topicID;
	private String topicName;


	public Topic() {}
	
	public Topic(String topicID, String topicName) {
		super();
		this.topicID = topicID;
		this.topicName = topicName;
	} 
	
	public String getTopicID() {
		return topicID;
	}
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
		
}
