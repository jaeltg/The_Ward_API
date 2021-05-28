package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.people.Patient;
import com.codeclan.example.The_Ward.models.people.Specialist;
import com.codeclan.example.The_Ward.repositories.PatientRepository;
import com.codeclan.example.The_Ward.repositories.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

}
