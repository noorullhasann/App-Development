package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SongModel;

public interface SongRepo extends JpaRepository<SongModel, Integer> {

}
