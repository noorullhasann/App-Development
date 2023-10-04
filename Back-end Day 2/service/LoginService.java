package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoginModel;
import com.example.demo.repo.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginrepo;
	
	public List<LoginModel> getuserdetails(){
		return loginrepo.findAll();
	}
	
	public Optional<LoginModel> getuserByID(int id){
		return loginrepo.findById(id);
	}
	
	public void postDetails(LoginModel lm){
		loginrepo.save(lm);
	}
	
	public LoginModel putDetails(LoginModel lm) {
		return loginrepo.save(lm);
	}
	
	public void deletedetailsById(int id) {
		loginrepo.deleteById(id);
	}
	
}
