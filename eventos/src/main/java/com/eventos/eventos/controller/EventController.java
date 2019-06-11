package com.eventos.eventos.controller;

import com.eventos.eventos.model.Event;
import com.eventos.eventos.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventRepository repository;

    @GetMapping
    public Collection<Event> get(@RequestParam(required = false, value = "name") String name){
        if(name !=null){
            return repository.findAllByName(name);
        }
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") String id ){
        Event event = repository.findById(id).orElse(null);
        if(event == null) {
            return ResponseEntity.notFound()
                    .build();
        }
        return ResponseEntity.ok(event);
    }

    @PostMapping
    public Event create(@RequestBody Event event){
        return repository.save(event);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        repository.deleteById(id);
    }

}
