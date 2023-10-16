package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name= "admin")
public class AdminModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminid;
	
	private String songname;
	
	private String singername;
	
	private String music;
	
	private String audio;
}
