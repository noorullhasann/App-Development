package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "song_details")
public class SongModel {
	
	@Id
	private int id;
	
	private String songname;
	
	private String artist;
	
	private String album;
	
	private String genere;
}
