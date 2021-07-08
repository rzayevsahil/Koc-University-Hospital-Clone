package com.koc.hospital.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koc.hospital.entities.concretes.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {

	
	Education getById(int id);
	
	Education getBySchoolName(String name);
}
