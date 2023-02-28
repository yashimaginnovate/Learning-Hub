package com.imaginnovate.learninghub.service;

import java.util.List;

import com.imaginnovate.learninghub.entity.Course;

public interface CourseService {
	
	Course createCourse(Course course);
	List<Course> getAllCourses();

}

