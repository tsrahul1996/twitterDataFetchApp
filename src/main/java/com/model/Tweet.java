package com.model;

public class Tweet {

    private String id;
    private String text;
    
	public Tweet() {
		super();
	}

	public Tweet(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
   
}
