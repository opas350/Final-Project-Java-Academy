package com.opas350.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;		// Id of User for DB
	String name;
	String hobby1;	// Name of the Hobby
	String hobby2;	// Name of the Hobby
	String hobby3;	// Name of the Hobby
	String hobby4;	// Name of the Hobby
	String message;	// message of the Hobby
	
	public User() {}
	
	public User(Long id,String name, String hobby1, String hobby2, String hobby3, String hobby4, String message){
		this.id = id;
		this.name = name;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.hobby3 = hobby3;
		this.hobby4 = hobby4;
		this.message = message;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHobby1() {
		return hobby1;
	}
	
	public void setHobby1(String hobby1) {
		this.hobby1 = hobby1;
	}
	
	public String getHobby2() {
		return hobby2;
	}
	
	public void setHobby2(String hobby2) {
		this.hobby2 = hobby2;
	}
	
	public String getHobby3() {
		return hobby3;
	}
	
	public void setHobby3(String hobby3) {
		this.hobby3 = hobby3;
	}
	
	public String getHobby4() {
		return hobby4;
	}
	
	public void setHobby4(String hobby4) {
		this.hobby4 = hobby4;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMesage(String message) {
		this.message = message;
	}
	
	
}
