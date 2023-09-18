package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Empleado;
import com.example.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository repo;
	
	@Override
	public Empleado registrarEmpleado(Empleado empleado) {
		
		return repo.save(empleado);
	}

}
