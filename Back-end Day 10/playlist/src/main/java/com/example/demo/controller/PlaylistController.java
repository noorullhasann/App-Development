package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PlaylistModel;
import com.example.demo.service.PlaylistService;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

	@Autowired
	private PlaylistService ps;
	
	@GetMapping("displaysongs")
	public List<PlaylistModel> getPlaylist(){
		return ps.getplaydet();
	}
	
	@DeleteMapping("deletesong")
	public void deletesong(int id){
		ps.deleteplayByid(id);
	}
}
