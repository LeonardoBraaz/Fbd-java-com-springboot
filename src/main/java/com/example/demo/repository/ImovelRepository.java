package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Imovel;



@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long>{

	
	
	
}
