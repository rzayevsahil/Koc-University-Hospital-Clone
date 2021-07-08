package com.koc.hospital.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koc.hospital.entities.concretes.Appoinment;

@Repository
public interface AppoinmentRepository extends JpaRepository<Appoinment, Integer> {

	Appoinment findById(int id);
	
	//List<Appoinment> findAllByAppoinmentDate(Date appoinmentTimeStart, Date appoinmentTimeFinish);
	
	List<Appoinment> findAllByOrderByAppoinmentDateDesc();
	
	List<Appoinment> findAllByOrderByAppoinmentDateAsc();
	
	
}
