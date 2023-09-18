package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Deporte;
import com.example.repository.DeporteRepository;

@Service
public class DeporteServiceImpl implements DeporteService{

	@Autowired
	private DeporteRepository repositorio;

	@Override
	public List<Deporte> listaDeporte() {
		return repositorio.findAll();
	} 
	
	

}


