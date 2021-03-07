package com.pack.main.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.main.domain.Appointment;
import com.pack.main.repository.AppointmentRepository;

@RestController   
public class AppointmentController {
	
	@Autowired
	private AppointmentRepository repository; 
	
	@RequestMapping("/appointments")
	public Iterable <Appointment>  getAppointments(){
		return repository.findAll();
	}
	
}