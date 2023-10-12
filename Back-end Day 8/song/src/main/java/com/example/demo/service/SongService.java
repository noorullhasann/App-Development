package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SongModel;
import com.example.demo.repo.SongRepo;

@Service
public class SongService {

	@Autowired
	private SongRepo sor;
	
	public List<SongModel> getSongDetails()
	{
		return sor.findAll();
	}
	
	public SongModel putDetails(SongModel som)
	{
		return sor.save(som);
	}
	
	public void deleteDetails(int id) {
		sor.deleteById(id);
	}
}
