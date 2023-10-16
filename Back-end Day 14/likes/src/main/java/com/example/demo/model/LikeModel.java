package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "like")
public class LikeModel {
	
	@Id
	private int id;
	
	private int userid;
	
	private int songid;
	
	private boolean value;
}
