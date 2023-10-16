package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SongModel;

@Repository
public interface SongRepo extends JpaRepository<SongModel, Integer> {


}
