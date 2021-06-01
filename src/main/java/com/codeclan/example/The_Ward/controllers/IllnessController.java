package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.repositories.IllnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IllnessController {

    @Autowired
    IllnessRepository illnessRepository;

    @GetMapping(value = "/illnesses")
    public ResponseEntity<List<Illness>> getAllIllnesses(){
        return new ResponseEntity<>(illnessRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/illnesses/{id}")
    public ResponseEntity getIllness(@PathVariable Long id) {
        return new ResponseEntity<>(illnessRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/illnesses")
    public ResponseEntity<Illness> createIllness(@RequestBody Illness illness){
        illnessRepository.save(illness);
        return new ResponseEntity<>(illness, HttpStatus.CREATED);
    }

    @PutMapping(value="/illnesses/{id}")
    public ResponseEntity<Illness> updateIllness(@RequestBody Illness illness, @PathVariable Long id){
        Illness illnessToUpdate = illnessRepository.findById(id).get();
        illnessToUpdate.setName(illness.getName());
        illnessToUpdate.setAllSymptoms(illness.getAllSymptoms());
        illnessToUpdate.setSpecialist(illness.getSpecialist());
        illnessRepository.save(illnessToUpdate);
        return new ResponseEntity<>(illnessToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/illnesses/{id}")
    public ResponseEntity<Long> deleteIllness(@PathVariable Long id){
        illnessRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
