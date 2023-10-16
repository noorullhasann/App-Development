package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SongModel;
import com.example.demo.repo.SongRepo;

@Service
public class SongService {

	@Autowired
	private SongRepo sor;
	
	 public SongModel create(SongModel som)
		{
			return sor.save(som);
		}
	 
	 public Iterable<SongModel> readAll()
		{
			return sor.findAll();
		}
	

}
