package com.codeclan.example.The_Ward.repositories;

import com.codeclan.example.The_Ward.models.illness.Illness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IllnessRepository extends JpaRepository<Illness, Long> {

}
