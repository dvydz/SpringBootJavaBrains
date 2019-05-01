package com.springboot.api.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository <Courses,String>{
	//to find all the courses by id of Topics Class(Topics(Classname) + Id(Property))
	public List<Courses> findByTopicsId(String topicId);
}
