package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.people.Patient;
import com.codeclan.example.The_Ward.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping(value = "/patients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        return new ResponseEntity<>(patientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/patients/{id}")
    public ResponseEntity getPatient(@PathVariable Long id) {
        return new ResponseEntity<>(patientRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient){
        patientRepository.save(patient);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

    @PutMapping(value="/patients/{id}")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient, @PathVariable Long id){
        Patient patientToUpdate = patientRepository.findById(id).get();
        patientToUpdate.setName(patient.getName());
        patientToUpdate.setAge(patient.getAge());
        patientToUpdate.setHealth(patient.getHealth());
        patientToUpdate.setIllness(patient.getIllness());
        patientToUpdate.setStatus(patient.getStatus());
        patientRepository.save(patientToUpdate);
        return new ResponseEntity<>(patientToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/patients/{id}")
    public ResponseEntity<Long> deletePatient(@PathVariable Long id){
        patientRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
