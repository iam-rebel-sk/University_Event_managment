package com.assignment.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "events")
public class Event {

    @Id
    private Long eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate eventDate;
    private LocalTime eventStartTime;
    private LocalTime eventEndTime;






}
