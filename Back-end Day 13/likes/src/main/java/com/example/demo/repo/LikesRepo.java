package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LikeModel;

@Repository
public interface LikesRepo extends JpaRepository<LikeModel, Integer>{

}
