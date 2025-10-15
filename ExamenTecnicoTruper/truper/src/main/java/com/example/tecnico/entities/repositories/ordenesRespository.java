package com.example.tecnico.entities.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tecnico.entities.OrdenesEntity;

@Repository
public interface ordenesRespository extends CrudRepository<OrdenesEntity, Long>{
	

}
