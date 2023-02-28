package com.imaginnovate.learninghub.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.learninghub.entity.Event;
import com.imaginnovate.learninghub.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public Event create(Event event) {
		return eventRepository.save(event);
	}

	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}
	
	public List<Event> getByEventType(String eventType) {
		return eventRepository.getEventByEventType(eventType);
	}
	
	public List<Event> latestEvent() {
		LocalDateTime currentTime =LocalDateTime.now();
		return eventRepository.findByStarttimeAfterOrderByStarttimeDesc(currentTime);
	}
	
	public List<String> fetchEventTypes(){
		return eventRepository.findDistinctEventTypes();
	}
	
	public void enrollCount(Long id) {
		Event event= eventRepository.getById(id);
		int newcount = (event.getCount() + 1);
		event.setCount(newcount);
		eventRepository.save(event);
	}
	
	public void deleteById(Long id) {
		eventRepository.deleteById(id);
	}

}
