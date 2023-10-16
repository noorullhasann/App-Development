package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PlaylistModel;
import com.example.demo.repo.PlaylistRepo;

@Service
public class PlaylistService {
	
	@Autowired
	private PlaylistRepo pr;
	
	public List<PlaylistModel> getplaydet(){
		return pr.findAll();
	}
	
	public void deleteplayByid(int id) {
		pr.deleteById(id);
	}
}
