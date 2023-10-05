package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginModel;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	public LoginService ls;
	
	@GetMapping("/getdetails")
	public List<LoginModel> getuserdetails()
	{
		return ls.getuserdetails();
	}
	
	@GetMapping("/getdetailsById/{id}")
	public Optional<LoginModel> getuserByID(@PathVariable int loginid){
		return ls.getuserByID(loginid);
	}
	
	@PostMapping("/postdetails")
	public void postDetails(@RequestBody LoginModel lm) {
		ls.postDetails(lm);
	}
	
	@PutMapping("/putdetails/{id}")
	public void putDetails(@PathVariable int loginid, @RequestBody LoginModel lm){
		lm.setLoginid(loginid);
		ls.putDetails(lm);
	}
	
	@DeleteMapping("/deleteByid/{id}")
	public void deleteById(@PathVariable int loginid){
		ls.deletedetailsById(loginid);
	}
	
	
}
