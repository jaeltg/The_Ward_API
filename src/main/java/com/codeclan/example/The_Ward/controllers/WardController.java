package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.rooms.Ward;
import com.codeclan.example.The_Ward.repositories.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WardController {

    @Autowired
    WardRepository wardRepository;

    @GetMapping(value = "/wards")
    public ResponseEntity<List<Ward>> getAllWards(){
        return new ResponseEntity<>(wardRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/wards/{id}")
    public ResponseEntity getWard(@PathVariable Long id) {
        return new ResponseEntity<>(wardRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/wards")
    public ResponseEntity<Ward> createWard(@RequestBody Ward ward){
        wardRepository.save(ward);
        return new ResponseEntity<>(ward, HttpStatus.CREATED);
    }

    @PutMapping(value="/wards/{id}")
    public ResponseEntity<Ward> updateWard(@RequestBody Ward ward, @PathVariable Long id){
        Ward wardToUpdate = wardRepository.findById(id).get();
        wardToUpdate.setCapacity(ward.getCapacity());
        wardToUpdate.setPatients(ward.getPatients());
        wardRepository.save(wardToUpdate);
        return new ResponseEntity<>(wardToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/wards/{id}")
    public ResponseEntity<Long> deleteWard(@PathVariable Long id){
        wardRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
