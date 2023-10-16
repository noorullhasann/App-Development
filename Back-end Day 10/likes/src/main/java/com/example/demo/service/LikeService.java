package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LikeModel;
import com.example.demo.repo.LikesRepo;

@Service
public class LikeService {
	
	@Autowired
	private LikesRepo lr;	
	
	public List<LikeModel> getlike(){
		return lr.findAll();
	}
	
	public void postlike(LikeModel lm) {
		lr.save(lm);
	}
	
	public LikeModel putsong(LikeModel lm) {
		return lr.save(lm);
	}
	
	public void deletelike(int id) {
		lr.deleteById(id);
	}
}
