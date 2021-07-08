package com.koc.hospital.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koc.hospital.entities.concretes.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Integer> {

	Adress getById(int id);
	
	Adress getByCityName(String name);
	
	Adress getByStreetName(String name);
	
	Adress getByPostCode(int postCode);
	
}
