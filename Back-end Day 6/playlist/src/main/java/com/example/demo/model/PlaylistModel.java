package com.example.demo.model;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "playlist")
public class PlaylistModel {

	@Id
	private int id;
	
	private int userid;
	
	private int songid;
	
	
}
