package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.Constant.ApiConstant;

@Configuration
@EnableWebSecurity
public class SecurityConfigure {

	@Bean
	public SecurityFilterChain securityfilterchange(HttpSecurity http) throws Exception{
		http.cors().disable()
		.csrf().disable()
		.authorizeHttpRequests().requestMatchers(ApiConstant.USER+"/*").permitAll()
		.and().authorizeHttpRequests().requestMatchers("/admin/*").authenticated();
		return http.build();
	}
	
}
