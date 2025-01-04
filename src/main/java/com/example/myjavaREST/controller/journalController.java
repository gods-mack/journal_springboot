package com.example.myjavaREST.controller;

import com.example.myjavaREST.repository.journalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.myjavaREST.entity.journalEntity;
import  com.example.myjavaREST.repository.journalRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


@RestController
@RequestMapping("/journal")
public class journalController {

    private Map<Long, journalEntity> journalTable =  new HashMap<>();
    @Autowired
    private final journalRepository jRepository;

    public journalController(journalRepository _jRepository) {
        this.jRepository = _jRepository;
    }


    @GetMapping("/getall")
    public Iterable<journalEntity> findAllEmployees() {
        return this.jRepository.findAll();
    }

    @GetMapping
    public List<journalEntity> getAll()
    {
        return  new ArrayList<>(journalTable.values());
    }


    @PostMapping
    public ResponseEntity<String> post(@RequestBody journalEntity jentry) {

        journalTable.put(jentry.getId(), jentry);
        journalEntity j = this.jRepository.save(jentry);

        return ResponseEntity.ok("OK Saved successfully");
    }

    @GetMapping("/id/{myid}")
    public ResponseEntity<journalEntity> getById(@PathVariable Long myid) {
        return ResponseEntity.ok(journalTable.get(myid));
    }
}


// CREATE USER admuser WITH PASSWORD 'admuser123';p
