package com.codeclan.example.The_Ward.repositories;

import com.codeclan.example.The_Ward.models.people.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {


}
