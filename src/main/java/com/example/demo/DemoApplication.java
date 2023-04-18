package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.projections.ClienteProjection;
import com.example.demo.repository.ClienteRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		ClienteProjection client = clienteRepository.findByCliente("101.101.101-01");
		System.out.println("Nome: "+client.getNome()+"\n"+ "Numero de Telefone: "+client.getNumero_telefone());
	
//		List<ClienteProjection> listClientes = clienteRepository.findByClientes((long) 1);
//		for(ClienteProjection listaCurrent: listClientes) {
//			System.out.println(listaCurrent.getNome());
//		}
	
	
	
	}

}
