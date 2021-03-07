package com.pack.main;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import com.pack.main.domain.Appointment;
import com.pack.main.domain.User;
import com.pack.main.repository.AppointmentRepository;
import com.pack.main.repository.UserRepository;


public class JavaBackendCrudApplication {

	
	private static final org.slf4j.Logger logger1 = LoggerFactory.getLogger(JavaBackendCrudApplication.class);
		
	@Autowired
	private UserRepository  userrepository;
	@Autowired
	private AppointmentRepository appointmentrepo;
    
	
	public static void main(String[] args) {
		SpringApplication.run(JavaBackendCrudApplication.class, args);
		 
		logger1.info("Hello AHMED, I'm in static main method");
	
	}

	@Bean
	CommandLineRunner runner(){
		// TODO Auto-generated method stub
		return (args) ->{
		logger1.info("Afandy AHMED, I'm in CommandLineRunner and i should run before staic main method");

		User user1 = userrepository.save( new User("Ahmed Afandy","ahmed.gmail.com"));
		User user2 = userrepository.save( new User("Aylin Afandy","aylin@gmail.com"));
	
		Appointment	appointment1=new Appointment("appointment with Doctor","health","03/12/2021","2:30pm",user1);
		Appointment	appointment2=new Appointment("meeting with Career Coach","Education ",
				"03/20/2021","12:30pm",user2);
		appointmentrepo.save(appointment1);
		appointmentrepo.save(appointment2);
		

	};
	
			
	}	
	
	
}
