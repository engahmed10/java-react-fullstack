package com.pack.main.domain;

import javax.persistence.Entity;     
import javax.persistence.FetchType;
import javax.persistence.Id;           
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  

@Entity
public class Appointment  {

		@Id                                             
		@GeneratedValue(strategy=GenerationType.AUTO) 
		
		private long id;
		private String Description;
		private String  type;
		private String date;
	    private String time;
	      
	   
	   @ManyToOne(fetch = FetchType.EAGER)  
	   @JoinColumn(name="user")
	   private User user ;
	    

		public User getUser() {
		   return user;
	     }


	    public void setUser(User user) {
		    this.user = user;
	    }
       

		public Appointment() {
	    	
	    }
	    
		
		public Appointment(String description, String type, String date, String time,User user) {
			super();
			Description = description;
			this.type = type;
			this.date = date;
			this.time = time;
			this.user=user;
		}
		
		
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		

	}

	
	
