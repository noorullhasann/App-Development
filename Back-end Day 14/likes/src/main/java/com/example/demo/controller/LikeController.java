package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LikeModel;
import com.example.demo.service.LikeService;

@RestController
@RequestMapping("/likes")
public class LikeController {

	@Autowired
	private LikeService ls;
	
	@GetMapping("/likegetsong")
	public List<LikeModel> getlikesong(){
		return ls.getlike();
	}
	
	@PostMapping("/postlike")
	public void postlike(LikeModel lm) {
		ls.postlike(lm);
	}
	
	@PutMapping("/putlike")
	public LikeModel putlike(LikeModel lm) {
		return ls.putsong(lm);
	}
	
	@DeleteMapping("/deletelike")
	public void deleteBylike(int id) {
		ls.deletelike(id);;
	}
}
