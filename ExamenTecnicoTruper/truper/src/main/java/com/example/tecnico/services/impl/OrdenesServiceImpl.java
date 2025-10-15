package com.example.tecnico.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tecnico.entities.OrdenesEntity;
import com.example.tecnico.entities.repositories.ordenesRespository;
import com.example.tecnico.services.OrdenesService;

@Service
public class OrdenesServiceImpl implements OrdenesService{

	@Autowired ordenesRespository ordenesRespository;
	
	@Override
	public void crearOrden(OrdenesEntity orden) {
		ordenesRespository.save(orden);
		
	}
	
	
}
