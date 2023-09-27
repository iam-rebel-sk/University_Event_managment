package com.assignment.UniversityEventManagement.repo;

import com.assignment.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface IEvent extends JpaRepository<Event, Long> {
    List<Event> findByEventDate(LocalDate date);



}
