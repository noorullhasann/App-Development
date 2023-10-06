package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LoginModel;
import com.example.demo.model.SignupModel;

@Repository
@EnableJpaRepositories
public interface LoginRepo extends JpaRepository<LoginModel, Integer>{
	public Optional<SignupModel> findByUsername(String username);
}
