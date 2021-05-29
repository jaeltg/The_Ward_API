package com.codeclan.example.The_Ward.repositories;

import com.codeclan.example.The_Ward.models.rooms.WaitingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaitingRoomRepository extends JpaRepository<WaitingRoom, Long> {
}
