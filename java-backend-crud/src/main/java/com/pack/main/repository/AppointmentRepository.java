package com.pack.main.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pack.main.domain.Appointment;


public  interface  AppointmentRepository extends CrudRepository <Appointment, Long>{

	
	
  //List<Appointment>  findByDescription(String description);
 // List<Appointment>  findByDate(String date);
 // List<Appointment>  findByTime(String time);
  
}
