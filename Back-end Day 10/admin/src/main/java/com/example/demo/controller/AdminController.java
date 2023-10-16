package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminModel;
import com.example.demo.model.SongModel;
import com.example.demo.repo.AdminRepo;
import com.example.demo.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    private AdminService ads;
	
	@Autowired
	private AdminRepo adr;
	
	@PostMapping("/posting")
	public AdminModel saveAll(@RequestBody AdminModel adm)
	{
		return ads.create(adm);
	}
	
	@GetMapping("/geting")
	public Iterable<AdminModel> get()
	{
		return ads.readAll();
	}
	

	@DeleteMapping("/delete/{id}")
	public void deleteSong(@PathVariable int id) {
		ads.deletesong(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<AdminModel> Update(@PathVariable int id, @RequestBody AdminModel adsong) {
	    AdminModel update = adr.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found exception"));
	    update.setAdminid(adsong.getAdminid());
	    update.setSongname(adsong.getSongname());
	    update.setSingername(adsong.getSingername());
	    update.setMusic(adsong.getMusic());
	    update.setAudio(adsong.getAudio());
	    adr.save(update);
	    return ResponseEntity.ok(update);
	}

	
	@GetMapping("/gettingbyId/{id}")
	public ResponseEntity<Optional<AdminModel>> getWithId(@PathVariable int id)
	{
		Optional<AdminModel>song=adr.findById(id);
		return ResponseEntity.ok(song);
	}
}
