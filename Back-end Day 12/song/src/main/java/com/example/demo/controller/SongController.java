package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SongModel;
import com.example.demo.repo.SongRepo;
import com.example.demo.service.SongService;

@RestController
@RequestMapping("/song")
public class SongController {

	@Autowired
	public SongService sos;

	@Autowired
	public SongRepo sor;
	
	@PostMapping("/posting")
	public SongModel saveAll(@RequestBody SongModel som)
	{
		return sos.create(som);
	}
	
	@GetMapping("/geting")
	public Iterable<SongModel> get()
	{
		return sos.readAll();
	}
	
}
