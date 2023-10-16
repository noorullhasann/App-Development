package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.AuthenticationRequest;
import com.example.demo.DTO.AuthenticationResponse;
import com.example.demo.DTO.RegisterRequest;
import com.example.demo.enumerate.Role;
import com.example.demo.model.User;
import com.example.demo.repo.SignupRepo;
import com.example.demo.util.JwtService;


@Service
public class EntryService {
	
	@Autowired
	private SignupRepo sr;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtService jwtser;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	public AuthenticationResponse validateUser(AuthenticationRequest request) {
		
		authenticationManager.authenticate(
				
			new UsernamePasswordAuthenticationToken(
					request.getEmail(), request.getPassword()
				)
		);
		
		var user = sr.findByEmail(request.getEmail()).orElseThrow();
		
		var jwtToken = jwtser.generateToken(user);
		
		return AuthenticationResponse.builder()
				.token(jwtToken)
				.build();
		
	}
	
	
	public AuthenticationResponse CreateNewUser(RegisterRequest request) {
		
		
		var user = User.builder()
				.name(request.getName())
				.phonenum(request.getPhonenum())
				.email(request.getEmail())
				.password(passwordEncoder.encode(request.getPassword()))
				.role(Role.USER)
				.build();
				
		
		List<Integer> emailCountList = sr.isEmailExist(user.getEmail());
		List<Integer> phnoCountList = sr.isPhnoExist(user.getPhonenum());
		
		if(emailCountList.get(0) !=  0) {
			
			return null;
		}
		else if(phnoCountList.get(0) != 0) {
			
			return null;
		}
		else {
			
			sr.save(user);
			
			var jwtToken = jwtser.generateToken(user);
			
			return AuthenticationResponse.builder()
					.token(jwtToken)
					.build();
		}
	}
}
