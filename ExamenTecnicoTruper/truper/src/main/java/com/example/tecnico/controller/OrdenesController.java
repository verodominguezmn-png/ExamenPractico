package com.example.tecnico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tecnico.entities.OrdenesEntity;
import com.example.tecnico.services.OrdenesService;

@RestController
@RequestMapping("/test")
public class OrdenesController {
	
	@Autowired
	private OrdenesService ordenesService;
	
	@PostMapping("/crearOrden")
	public ResponseEntity<OrdenesEntity> crearOrden(@RequestBody OrdenesEntity orden){
		ordenesService.crearOrden(orden);
		return new ResponseEntity<>(orden, HttpStatus.CREATED); 
	}

}
