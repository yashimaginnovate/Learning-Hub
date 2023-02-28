package com.imaginnovate.learninghub.service;

import java.util.List;

import com.imaginnovate.learninghub.entity.Event;

public interface EventService {
	
	Event create(Event event);
	List<Event> getAllEvents();
	List<Event> getByEventType(String eventType);
	List<Event> latestEvent();
	List<String> fetchEventTypes();
	void enrollCount(Long id);
	void deleteById(Long id);

}
