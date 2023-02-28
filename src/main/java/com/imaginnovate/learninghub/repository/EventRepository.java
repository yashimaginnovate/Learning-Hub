package com.imaginnovate.learninghub.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.imaginnovate.learninghub.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	List<Event> getEventByEventType(@RequestParam String eventType);
	List<Event> findByStarttimeAfterOrderByStarttimeDesc(LocalDateTime starttime);
	
	@Query("SELECT DISTINCT e.eventType FROM Event e")
	List<String> findDistinctEventTypes();
}
