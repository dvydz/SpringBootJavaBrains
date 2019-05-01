package com.springboot.api.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.topic.Topics;

@RestController
public class CourseController {
	
	@Autowired
	private CoursesService courseService;
	
	@RequestMapping("/getTopic/{id}/getAllCourses")
	public List<Courses> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
		}
	
	@RequestMapping("/getTopic/{topicId}/getCourse/{id}")
	public Courses topic(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value=("addTopic/{topicId}/addCourse"), method=RequestMethod.POST)
	public void addCourse(@RequestBody Courses courses,@PathVariable String topicId) {
		courses.setTopic(new Topics(topicId,"",""));
		courseService.addCourse(courses);
	}
	
	@RequestMapping(value="updateTopic/{topicId}/updateCourse/{id}", method=RequestMethod.PUT)
	public void updateCourse(@RequestBody Courses courses,@PathVariable String id,@PathVariable String topicId) {
		courses.setTopic(new Topics(topicId,"",""));
		courseService.updateCourse(courses);
	}
	
	@RequestMapping(value="deleteTopic/{topicId}/deleteCourse/{id}", method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
	
	}
