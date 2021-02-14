package io.leanLearner.springboot.pojos;

public class Greet {
	private String greeting;
	
	public Greet() {
	}
	
	public Greet(String wishes) {
		super();
		this.greeting = wishes;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
}
