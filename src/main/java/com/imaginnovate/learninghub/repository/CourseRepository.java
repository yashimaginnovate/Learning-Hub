package com.imaginnovate.learninghub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.learninghub.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
