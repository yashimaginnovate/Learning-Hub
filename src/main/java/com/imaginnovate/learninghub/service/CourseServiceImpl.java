package com.imaginnovate.learninghub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.learninghub.entity.Course;
import com.imaginnovate.learninghub.repository.CourseRepository;

@Service
public class CourseServiceImpl  implements CourseService{
	@Autowired
	CourseRepository courseRepository;
	
	 public Course createCourse(Course course) {
		 return courseRepository.save(course);
	 }
	
	  public List<Course> getAllCourses(){
		  return courseRepository.findAll();
	  }

}
