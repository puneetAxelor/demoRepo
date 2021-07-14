package com.spring.covidManager.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.covidManager.entity.Patient;
import com.spring.covidManager.service.PatientService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PatientRestController {

	// inject PatientService using constructor injection
	private PatientService patientService;
	
	@Autowired
	public PatientRestController(PatientService thePatientService) {
		patientService = thePatientService;
	}
	
	// method to get the list of patients
	@GetMapping("/patients")
	public List<Patient> findAll() {
		return patientService.findAll();
	}
	
	
	// add mapping for GET /patients/{patientId}
	@GetMapping("/patients/{patientId}")
	public Patient getEatient(@PathVariable int patientId) {
		
		Patient thePatient = patientService.findById(patientId);
				
		if (thePatient == null ) {
			throw new RuntimeException("Patient id not found - "+patientId);
		}
		
		return thePatient;
	}
	
	// add mapping for POST /patients - add new patient
	
	@PostMapping("/saveCustomer")
	public Patient addPatient(@RequestBody Patient thePatient) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this will save new item ... instead of update
		
		thePatient.setId(0);
		
		patientService.save(thePatient);
		
		return thePatient;
	}
	
	// add mapping for PUT /patients - update patient
	
	@PutMapping("/patients")
	public Patient updatePatient(@RequestBody Patient thePatient) {
		
		patientService.save(thePatient);
		
		return thePatient;
	}
	
	// add mapping for DELETE /patients/{patientId} - delete patient
	
	@DeleteMapping("/patients/{patientId}")
	public String deletePatient(@PathVariable int patientId) {
		Patient tempPatient = patientService.findById(patientId);
		
		// throw exception if null
		
		if (tempPatient == null) {
			throw new RuntimeException("Patient id not found "+patientId);
		}
		
		patientService.deleteById(patientId);
		
		return "Deleted patient id - "+patientId;
	}
}
