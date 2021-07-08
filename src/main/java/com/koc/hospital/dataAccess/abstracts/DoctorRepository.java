package com.koc.hospital.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koc.hospital.entities.concretes.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	Doctor getById(int id);
	
	List<Doctor> getByGender_Id(int genderId);
	
	List<Doctor> getByDepartment_Id(int departmentId);
	
	List<Doctor> getByAgeGreaterThan(int age);
	
	List<Doctor> getByAgeLessThan(int age);
	
	//List<Doctor> findTop3ByAge(); // bunun kullanımında dbde hiç veri olmadığından kaynaklı exception yenildi dbde olunca açılacak
}
