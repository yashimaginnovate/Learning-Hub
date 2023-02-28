package com.imaginnovate.learninghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.learninghub.entity.Enroll;
import com.imaginnovate.learninghub.service.EnrollService;

@RestController
public class EnrollContoller {
	
	@Autowired
	EnrollService enrollService;
	
	@PostMapping("/enroll")
	public String userEnroll(@RequestBody Enroll enroll) {
		enrollService.saveEnrolled(enroll);
		return "Enrolled";
	}
	
	@GetMapping("/getByEventId/{eventId}")
	public List<Enroll> getEnrolledByEventId(@PathVariable long eventId){
		List<Enroll> list= enrollService.getByEventId(eventId);
		return list;
	}
	
	
}
