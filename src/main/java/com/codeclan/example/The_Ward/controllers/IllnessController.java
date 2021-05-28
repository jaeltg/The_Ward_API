package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.repositories.IllnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IllnessController {

    @Autowired
    IllnessRepository illnessRepository;

    @GetMapping(value="/illnesses")
    public ResponseEntity<List<Illness>> getAllIllnesses() {
        return new ResponseEntity<>(illnessRepository.findAll(), HttpStatus.OK);
    }
}
