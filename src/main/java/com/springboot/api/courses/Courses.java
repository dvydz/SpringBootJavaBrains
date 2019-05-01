package com.springboot.api.courses;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboot.api.topic.Topics;

@Entity
public class Courses {
	@Id
	private String id;
	private String name;
	private String description;
	
	//LazyLoading this prevents topic data to be displayed while loading a course
	@ManyToOne
	private Topics topics;
	
	public Courses() {
	
	}

	public Courses(String id, String name, String description, Topics topics) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topics = new Topics("topicId","","");
	}

	public Topics getTopic() {
		return topics;
	}
	
	public void setTopic(Topics topics) {
		this.topics = topics;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
