package com.eventos.eventos.repository;

import com.eventos.eventos.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, String> {

    List<Event> findAllByName(String name);


}
