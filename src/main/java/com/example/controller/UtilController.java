package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Deporte;
import com.example.entity.Pais;
import com.example.service.DeporteService;
import com.example.service.PaisService;
import com.example.util.AppSettings;

@RestController
@RequestMapping("/url/util")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class UtilController {

	@Autowired
	private DeporteService  deporteService;
	
	@Autowired
	private PaisService paisService;

	@GetMapping("/deporte")
	@ResponseBody
	public ResponseEntity<List<Deporte>> listaDeporte(){
		List<Deporte> lista = deporteService.listaDeporte();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/pais")
	@ResponseBody
	public ResponseEntity<List<Pais>> listaPais(){
		List<Pais> lista = paisService.listarPaises();
		return ResponseEntity.ok(lista);
	}
	
}
