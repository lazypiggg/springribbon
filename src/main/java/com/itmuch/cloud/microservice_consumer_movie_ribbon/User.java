package com.itmuch.cloud.microservice_consumer_movie_ribbon;

public class User {
	
	private Long id;
	private String username;
	private Integer age;
	
	public User(Long id, String un, Integer age) {
		this.id = id;
		this.username = un;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
}
