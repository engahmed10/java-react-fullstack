package com.pack.main.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User   {
	
	@Id                               
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userid;
	private String fullname ;
	private String email;
	
	@OneToMany( mappedBy="user",cascade=CascadeType.ALL)   
	 List<Appointment> appointment;     

	
	public User(String fullname,  String email) {
		super();
		this.fullname = fullname;
		this.email = email;
	}
	
	public User() {
		
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long id) {
		this.userid = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
