package com.codeclan.example.The_Ward.repositories;

import com.codeclan.example.The_Ward.models.rooms.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {
}
