package com.assignment.UniversityEventManagement.controller;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    @Autowired
    EventService myEvent;

    @PostMapping("events")
    public String addAllEvents(@RequestBody List<Event> newEvents){
        return myEvent.addAllEvents(newEvents);
    }

    @GetMapping("events/date")
    public List<Event> getAllEventsByDate(@RequestParam LocalDate date){
        return myEvent.getAllEventsByDate(date);
    }

    @GetMapping("event/id/{id}")
    public Optional<Event> getEventById(@PathVariable Long id){
        return myEvent.getEventById(id);
    }
    @PutMapping("event/id/{id}")
    public String updateEventById(@PathVariable Long id, @RequestBody Event newEvent){
        return myEvent.updateEventById(id,newEvent);
    }

    @DeleteMapping("event/id/{id}")
    public String removeEventById(@PathVariable Long id){
        return  myEvent.removeEventById(id);
    }
}
