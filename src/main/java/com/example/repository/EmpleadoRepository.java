package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Empleado;


public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
