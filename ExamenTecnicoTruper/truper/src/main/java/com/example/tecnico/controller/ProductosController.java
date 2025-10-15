package com.example.tecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tecnico.entities.OrdenesEntity;
import com.example.tecnico.entities.ProductoEntity;
import com.example.tecnico.services.OrdenesService;
import com.example.tecnico.services.ProductosService;

@RestController
@RequestMapping
public class ProductosController {

	@Autowired
	private OrdenesService ordenesService;
	@Autowired
	private ProductosService productosService;
	
	@PostMapping("/crearProductos")
	public ResponseEntity<List<ProductoEntity>> crearOrden(@RequestBody OrdenesEntity orden, @RequestBody List<ProductoEntity> productos){
		ordenesService.crearOrden(orden);
		
		productos.stream().forEach(x -> x.setOrdenes(orden));
		
		productosService.crearProducto(productos);
		return new ResponseEntity<>(productos, HttpStatus.CREATED); 
	}

}

