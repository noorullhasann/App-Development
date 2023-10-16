package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;
import com.example.demo.model.SongModel;
import com.example.demo.repo.AdminRepo;
import com.example.demo.repo.SongRepo;


@Service
public class AdminService {

	@Autowired
	private AdminRepo adr;
	
	
	 public AdminModel create(AdminModel adm)
		{
			return adr.save(adm);
		}
	 
	 public Iterable<AdminModel> readAll()
		{
			return adr.findAll();
		}
	 
	 public void deletesong(int id) {
		 adr.deleteById(id);
	 }
	 
	 public AdminModel post(AdminModel am) {
		 return adr.save(am);
	 }

}
