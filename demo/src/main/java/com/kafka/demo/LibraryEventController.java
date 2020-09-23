package com.kafka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class LibraryEventController {

	@Autowired
	LibraryEventProducer libraryEventProducer;
	
	@PostMapping("v1/libraryevent")
		public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent) throws JsonProcessingException{
		
		libraryEventProducer.sendLibraryEvent(libraryEvent);
		
		System.out.println("running...");
		return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
		
		
	}
}
