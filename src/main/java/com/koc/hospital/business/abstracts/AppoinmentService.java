package com.koc.hospital.business.abstracts;

import java.util.Date;
import java.util.List;

import com.koc.hospital.core.utilities.results.DataResult;
import com.koc.hospital.core.utilities.results.Result;
import com.koc.hospital.entities.concretes.Appoinment;

public interface AppoinmentService {
	Result add(Appoinment appoinment);

	Result update(Appoinment appoinment);

	Result delete(int id);
	
	DataResult<Appoinment>  getById(int id);
	
	DataResult<List<Appoinment>> getAll();
	
	//DataResult<List<Appoinment>> findAllByAppoinmentDate(Date appoinmentTimeStart, Date appoinmentTimeFinish);

	DataResult<List<Appoinment>> findAllByOrderByDesc();
	
	DataResult<List<Appoinment>> findAllByOrderByAsc();
 }
