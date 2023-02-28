package com.imaginnovate.learninghub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.learninghub.entity.Enroll;

public interface EnrollRepository extends JpaRepository<Enroll, Long> {
	
	List<Enroll> getEnrolledByEventId(Long eventId);

}
