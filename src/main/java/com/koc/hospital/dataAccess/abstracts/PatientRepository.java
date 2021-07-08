package com.koc.hospital.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.koc.hospital.entities.concretes.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	Patient getById(int id);
	
	Patient getByName(String name);
	
	List<Patient> getByAgeGreaterThan(int age);
	
	Patient getByEmail(String email);
	
	
}
