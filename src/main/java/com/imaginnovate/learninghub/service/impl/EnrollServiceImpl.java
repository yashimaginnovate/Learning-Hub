package com.imaginnovate.learninghub.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.learninghub.entity.Enroll;
import com.imaginnovate.learninghub.repository.EnrollRepository;
import com.imaginnovate.learninghub.service.EnrollService;

@Service
public class EnrollServiceImpl implements EnrollService {
	
	@Autowired
	EnrollRepository enrollRepository;
	
	public Enroll saveEnrolled(Enroll enroll) {
		return enrollRepository.save(enroll);
	}
	
	public List<Enroll> getByEventId(Long eventId) {
		return enrollRepository.getEnrolledByEventId(eventId);
	}
}
