package com.spring.covidManager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.covidManager.dao.PatientRepository;
import com.spring.covidManager.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

private PatientRepository patientRepository;
	
	// Constructor Injection
	@Autowired
	public PatientServiceImpl(PatientRepository thePatientRepository) {
		patientRepository = thePatientRepository;
	}
	
	@Override
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}

	// delegate the call to find the patient by id
	@Override
	public Patient findById(int theId) {
		Optional<Patient> result = patientRepository.findById(theId);
		
		Patient thePatient = null;
		if (result.isPresent()) {
			thePatient = result.get();
		} else {
			// we didn't find the eatient
			throw new RuntimeException("Did not find patient id - "+theId);
		}
		
		return thePatient;
	}

	@Override
	public void save(Patient thePatient) {
		patientRepository.save(thePatient);
	}

	// delegate delete call to jpa repository
	@Override
	public void deleteById(int theId) {
		patientRepository.deleteById(theId);
	}

}
