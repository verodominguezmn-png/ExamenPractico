package com.example.tecnico.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.tecnico.entities.ProductoEntity;
import com.example.tecnico.entities.repositories.ProductoRepository;
import com.example.tecnico.services.ProductosService;

public class ProductoServiceImpl implements ProductosService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public void crearProducto(List<ProductoEntity> productos) {
		productoRepository.saveAll(productos);
		
	}

}
