package com.model;

public class FetchDto {

	private String fetchType; 
	private String screenName;
	private String Hashtag;
	
	public FetchDto() {
		super();
	}

	public String getFetchType() {
		return fetchType;
	}

	public void setFetchType(String fetchType) {
		this.fetchType = fetchType;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getHashtag() {
		return Hashtag;
	}

	public void setHashtag(String hashtag) {
		Hashtag = hashtag;
	}

	public FetchDto(String fetchType, String screenName, String hashtag) {
		super();
		this.fetchType = fetchType;
		this.screenName = screenName;
		Hashtag = hashtag;
	}
	

	
}
