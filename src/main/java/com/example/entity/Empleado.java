package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empleado") 
@Getter
@Setter
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idEmpleado;
	private String nombres;
	private String fechaNacimiento;
	private int estado;
	private String fechaRegistro;
	
	@ManyToOne
	@JoinColumn(name = "idPais") 
	private Pais pais;
	
}
