package com.codeclan.example.The_Ward.repositories;

import com.codeclan.example.The_Ward.models.people.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
