package com.imaginnovate.learninghub.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.learninghub.entity.Event;
import com.imaginnovate.learninghub.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@PostMapping("/createevent")
	public String createEvent(@RequestBody Event event) {
		eventService.create(event);
		return "event created";
	}
	
	@GetMapping("/getallevents")
	public List<Event> getAllEvents() {
		List<Event> eventsList = eventService.getAllEvents();
		return eventsList;
	}
	
	@GetMapping("/getByEventType/{eventType}")
	public List<Event> getByEventType(@PathVariable String eventType){
		List<Event> eventsListByEventType = eventService.getByEventType(eventType);
		return eventsListByEventType;
	}
	
	@GetMapping("/latestEvents")
	public List<Event> getLatestEvents() {
		List<Event> latestEvents = eventService.latestEvent();
		return latestEvents;
	}
	
	@GetMapping("/eventTypes")
	public List<String> getEventTypes() {
		List<String> eventTypesList = eventService.fetchEventTypes();
		return eventTypesList;
	}
	
	@PatchMapping("/enroll")
	public String eventEnroll(Long id) {
		eventService.enrollCount(id);
		return "enrolled";
	}
	
	@DeleteMapping("/deleteBy/{id}")
	public String deletedEventByid(@PathVariable Long id) {
		eventService.deleteById(id);
		return "event Deleted";
	}

}
