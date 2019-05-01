package com.springboot.api.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	TopicService topicService;
	//Makind the topics mutable, because Arrays.asList is immutable
	private List<Topics> topicsList=new ArrayList<>(Arrays.asList(
			new Topics("Spring","SpringBootApplication","SpringBoot Description"),
			new Topics("Java","Java Core","Java Description"),
			new Topics("JavaScript","JavaScript","JavaScript Description")
			));	
	
	public List<Topics> getAllTopics(){
		return topicsList;
	}
	
	public Topics getTopic(String id) {
		return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		topicsList.add(topic);
	}

	public void updateTopic(Topics topic, String id) {
		topic.setId(id);
		for(int i=0;i<topicsList.size();i++) {
			Topics t= topicsList.get(i);
			if(t.getId().equals(id)) {
				topicsList.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
//		topicsList.removeIf(t -> t.getId().equals(id));   			//Easier way with less code
		for(int i=0;i<topicsList.size();i++) {
			if(topicsList.get(i).getId().equals(id)) {
				topicsList.remove(i);
			}
		}
	}
	
}
