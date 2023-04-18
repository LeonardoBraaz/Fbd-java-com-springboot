package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cliente;
import com.example.demo.projections.ClienteProjection;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(nativeQuery = true, value = "SELECT * "
			+ "FROM tb_cliente "
			+ "WHERE cpf LIKE (:cpf)")
	ClienteProjection findByCliente(String cpf);

	@Query(nativeQuery = true, value = "SELECT * "
			+ "FROM tb_cliente "
			+ "WHERE cpf LIKE (:cep)")
	List<ClienteProjection> findByClientes(long cep);
	
	
	
	
	
}
