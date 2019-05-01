package com.springboot.api.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
	@Autowired
	private CourseRepository courseRepository;
	public List<Courses> getAllCourses(String id){
		List<Courses> courses=new ArrayList<>();
		courseRepository.findByTopicsId(id).forEach(courses::add);
		return courses;
	}
	
	public Courses getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Courses courses) {
		courseRepository.save(courses);
	}

	public void updateCourse(Courses courses) {
		courseRepository.save(courses);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
}
