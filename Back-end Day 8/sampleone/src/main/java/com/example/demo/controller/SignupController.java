package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constants.Api;
import com.example.demo.model.User;
import com.example.demo.service.SignupService;

@RestController
@RequestMapping(Api.USER)
public class SignupController {

	@Autowired
	private SignupService ss;
	
	@GetMapping("/Signdetails")
	public List<User> getsignupDetails(){
		return ss.getsignupDetails();
	}
	
	
}
