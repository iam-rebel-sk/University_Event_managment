package com.assignment.UniversityEventManagement.service;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.repo.IEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEvent eventRepo;

    public String addAllEvents(List<Event> newEvents) {
        eventRepo.saveAll(newEvents);
        return newEvents.size()+" new events are added successfully.";
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return  eventRepo.findByEventDate(date);
    }

    public String updateEventById(Long id, Event newEvent) {
        Event presentEvent = eventRepo.findById(id).orElse(null);
        if(presentEvent != null){
            presentEvent.setEventName(newEvent.getEventName());
            presentEvent.setEventDate(newEvent.getEventDate());
            presentEvent.setLocationOfEvent(newEvent.getLocationOfEvent());
            presentEvent.setEventStartTime(newEvent.getEventStartTime());
            presentEvent.setEventEndTime(newEvent.getEventEndTime());

            return "Event with id: "+id+" has updated successfully.";
        }
        return  "Event with id: "+id+" not found.";
    }

    public String removeEventById(Long id) {
        Event presentEvent = eventRepo.findById(id).orElse(null);
        if(presentEvent != null) {
            eventRepo.deleteById(id);
            return "Event with id: " + id + " has deleted successfully.";
        }
        return  "Event with id: "+id+" not found.";
    }


    public Optional<Event> getEventById(Long id) {
        return eventRepo.findById(id);
    }
}
