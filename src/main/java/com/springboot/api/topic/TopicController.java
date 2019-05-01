package com.springboot.api.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getAllTopics")
	public List<Topics> getAllTopics() {
		return topicService.getAllTopics();
		}
	
	@RequestMapping("/getTopic/{id}")
	public Topics topic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value=("/addTopic"), method=RequestMethod.POST)
	public void addTopic(@RequestBody Topics topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(value="/updateTopic/{id}", method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topics topics,@PathVariable String id) {
		topicService.updateTopic(topics,id);
	}
	
	@RequestMapping(value="/topic/{id}", method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	
	}
