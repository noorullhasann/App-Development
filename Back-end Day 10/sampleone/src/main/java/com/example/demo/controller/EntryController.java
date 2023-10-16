package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constants.Api;
import com.example.demo.DTO.AuthenticationRequest;
import com.example.demo.DTO.AuthenticationResponse;
import com.example.demo.DTO.RegisterRequest;
import com.example.demo.service.EntryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(Api.ENTRY)
@RequiredArgsConstructor
public class EntryController {
	
	@Autowired
	EntryService eser;
	
	@PostMapping(value = "/post",  consumes = "application/json")
	public ResponseEntity<AuthenticationResponse> CreateNewUser(@RequestBody RegisterRequest request) {
		
		return ResponseEntity.ok(eser.CreateNewUser(request));
	}

	@PostMapping(value = "/auth_user")
	public ResponseEntity<AuthenticationResponse> validateUser(@RequestBody AuthenticationRequest request) {

		return ResponseEntity.ok(eser.validateUser(request));
	}
	
}
