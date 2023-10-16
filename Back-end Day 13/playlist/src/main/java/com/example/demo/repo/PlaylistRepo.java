package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PlaylistModel;

public interface PlaylistRepo extends JpaRepository<PlaylistModel, Integer>{

	
}
