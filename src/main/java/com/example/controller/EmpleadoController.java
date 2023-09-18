package com.example.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Empleado;
import com.example.service.EmpleadoService;
import com.example.util.AppSettings;

@RestController
@RequestMapping("/url/empleado")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class EmpleadoController {

	@Autowired
	private EmpleadoService service;
	
	@PostMapping
	public  ResponseEntity<?> insertaModalidad(@RequestBody Empleado obj){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Map<String, Object> salida = new HashMap<>();
		List<String> lstMensajes = new ArrayList<>();
		salida.put("errores", lstMensajes);

		obj.setIdEmpleado(0);
		obj.setEstado(1);
		obj.setFechaRegistro(sdf.format(new Date()));
		
		Empleado objSalida = service.registrarEmpleado(obj); 		
		if (objSalida == null) {
			lstMensajes.add("Error en el registro");
		}else {
			lstMensajes.add("Se registró el empleado de ID ==> " + objSalida.getIdEmpleado());
		}
		
		return ResponseEntity.ok(salida);
	}
	
}
