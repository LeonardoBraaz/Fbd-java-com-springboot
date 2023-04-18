package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.model.Cliente;
import com.example.demo.model.Imovel;
import com.example.demo.projections.ClienteProjection;
import com.example.demo.repository.ClienteRepository;

@RestController
public class ControllerCliente {
	
	@Autowired
	private ClienteRepository clienteRepository; 
	
	
//	
//	@GetMapping("cliente/{cpf}")
//	public ClienteDTO getClienteSqlNative(@PathVariable(value = "cpf") String cpf) {
//		ClienteProjection client = clienteRepository.findByCliente(cpf);
//		return new ClienteDTO(client);
//	}
	
//	@GetMapping("cliente/{cep}")
//	public Cliente getClientesNative(@PathVariable(value = "cep") String cep) {
//		ClienteProjection client = clienteRepository.findByCliente(cep);
//		return (Cliente) client;
//	}
	
	@GetMapping("cliente/{cpf}")
	@ResponseBody
	public ClienteDTO getClienteSqlNative(@PathVariable(value = "cpf") String cpf) {
	    ClienteProjection client = clienteRepository.findByCliente(cpf);
	    return new ClienteDTO(client);
	}
	
	
	
	
	
	
	
}
