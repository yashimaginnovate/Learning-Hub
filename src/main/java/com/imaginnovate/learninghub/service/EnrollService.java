package com.imaginnovate.learninghub.service;

import java.util.List;

import com.imaginnovate.learninghub.entity.Enroll;

public interface EnrollService {
	
	Enroll saveEnrolled(Enroll enroll);
	List<Enroll> getByEventId(Long eventId);

}
