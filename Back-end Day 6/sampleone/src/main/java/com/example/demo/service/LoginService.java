package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contacts;
import com.example.demo.repo.LoginRepo;

@Service
public class LoginService {

	@Autowired
	private LoginRepo loginrepo;
	
	public List<Contacts> getuserdetails(){
		return loginrepo.findAll();
	}
	
	public Optional<Contacts> getuserByID(long loginid){
		return loginrepo.findById(loginid);
	}
	
	public void postDetails(Contacts lm){
		loginrepo.save(lm);
	}
	
	public Contacts putDetails(Contacts lm) {
		return loginrepo.save(lm);
	}
	
	public void deletedetailsById(Long loginid) {
		loginrepo.deleteById(loginid);
	}
	
}
