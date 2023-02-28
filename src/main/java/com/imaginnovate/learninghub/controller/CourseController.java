package com.imaginnovate.learninghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.learninghub.entity.Course;
import com.imaginnovate.learninghub.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/createCourses")
	public String createCourses(@RequestBody Course course) {
		courseService.createCourse(course);
		return "course created";
	}

	@GetMapping("/getallcourses")
	public List<Course> getAllCourses(){
		List<Course> courseList = courseService.getAllCourses();
		return courseList;
	}
	
	
	

}
