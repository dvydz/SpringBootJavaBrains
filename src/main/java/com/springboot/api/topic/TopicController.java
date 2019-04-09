package com.springboot.api.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> topics() {
		return topicService.getTopics();
		}
	
	@RequestMapping("/topics/{id}")
	public Topics topic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value=("/topics"))
	public void getTopic(Topics topic) {
		
	}
	
	}
