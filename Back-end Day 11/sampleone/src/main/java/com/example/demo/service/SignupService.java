package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.SignupRepo;

@Service
public class SignupService {
	
	@Autowired
	private SignupRepo sr;
	
	
	public List<User> getsignupDetails(){
		return sr.findAll();
	}
	
	
	
}
