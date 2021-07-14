package com.spring.covidManager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.spring.covidManager.entity.Patient;


@CrossOrigin("http://localhost:4200")
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
}
