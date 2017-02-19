package com.example.bootdemo;

public class Topic {

	private int id;
	private String topicName;
	
	public Topic(){	
	}
	
	public Topic(int id, String topicName){
		super();
		this.id = id;
		this.topicName = topicName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
		
}
