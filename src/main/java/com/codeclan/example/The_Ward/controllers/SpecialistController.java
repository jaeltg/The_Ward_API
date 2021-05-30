package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.people.Specialist;
import com.codeclan.example.The_Ward.repositories.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpecialistController {

    @Autowired
    SpecialistRepository specialistRepository;

    @GetMapping(value = "/specialists")
    public ResponseEntity<List<Specialist>> getAllSpecialists(){
        return new ResponseEntity<>(specialistRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/specialists/{id}")
    public ResponseEntity getSpecialist(@PathVariable Long id) {
        return new ResponseEntity<>(specialistRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/specialists")
    public ResponseEntity<Specialist> createSpecialist(@RequestBody Specialist specialist){
        specialistRepository.save(specialist);
        return new ResponseEntity<>(specialist, HttpStatus.CREATED);
    }

    @PutMapping(value="/specialists/{id}")
    public ResponseEntity<Specialist> updateSpecialist(@RequestBody Specialist specialist, @PathVariable Long id){
        Specialist specialistToUpdate = specialistRepository.findById(id).get();
        specialistToUpdate.setName(specialist.getName());
        specialistToUpdate.setAge(specialist.getAge());
        specialistToUpdate.setSpeciality(specialist.getSpeciality());
        specialistRepository.save(specialistToUpdate);
        return new ResponseEntity<>(specialistToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/specialists/{id}")
    public ResponseEntity<Long> deleteSpecialist(@PathVariable Long id){
        specialistRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
