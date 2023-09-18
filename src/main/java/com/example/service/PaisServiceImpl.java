package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Pais;
import com.example.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisRepository repo;
	
	@Override
	public List<Pais> listarPaises() {
		
		return repo.findAll();
	}

}
