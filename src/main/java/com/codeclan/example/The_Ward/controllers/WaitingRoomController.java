package com.codeclan.example.The_Ward.controllers;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.rooms.WaitingRoom;
import com.codeclan.example.The_Ward.repositories.WaitingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WaitingRoomController {

    @Autowired
    WaitingRoomRepository waitingRoomRepository;

    @GetMapping(value = "/waitingrooms")
    public ResponseEntity<List<WaitingRoom>> getAllWaitingRooms() {
        return new ResponseEntity<>(waitingRoomRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/waitingrooms/{id}")
    public ResponseEntity getWaitingRoom(@PathVariable Long id) {
        return new ResponseEntity<>(waitingRoomRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/waitingrooms")
    public ResponseEntity<WaitingRoom> createWaitingRoom(@RequestBody WaitingRoom waitingRoom){
        waitingRoomRepository.save(waitingRoom);
        return new ResponseEntity<>(waitingRoom, HttpStatus.CREATED);
    }

    @PutMapping(value="/waitingrooms/{id}")
    public ResponseEntity<WaitingRoom> updateWaitingRoom(@RequestBody WaitingRoom waitingRoom, @PathVariable Long id){
        WaitingRoom waitingRoomToUpdate = waitingRoomRepository.findById(id).get();
        waitingRoomToUpdate.setCapacity(waitingRoom.getCapacity());
        waitingRoomRepository.save(waitingRoomToUpdate);
        return new ResponseEntity<>(waitingRoomToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/illnesses/{id}")
    public ResponseEntity<Long> deleteWaitingRoom(@PathVariable Long id){
        waitingRoomRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
