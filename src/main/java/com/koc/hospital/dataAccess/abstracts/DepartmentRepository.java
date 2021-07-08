package com.koc.hospital.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koc.hospital.entities.concretes.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
	Department getById(int id);

	Department getByName(String name);
	
}
