package com.koc.hospital.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koc.hospital.entities.concretes.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {

	Gender getById(int id);
	
	List<Gender> getByName(String name);
}
