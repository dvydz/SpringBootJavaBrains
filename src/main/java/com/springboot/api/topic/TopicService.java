package com.springboot.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topics> topics=Arrays.asList(
			new Topics("Spring","SpringBootApplication","SpringBoot Description"),
			new Topics("Java","Java Core","Java Description"),
			new Topics("JavaScript","JavaScript","JavaScript Description")
			);	
	
	public List<Topics> getTopics(){
		return topics;
	}
	
	public Topics getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
