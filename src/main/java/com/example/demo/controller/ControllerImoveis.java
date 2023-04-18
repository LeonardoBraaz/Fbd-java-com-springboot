package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.model.Imovel;
import com.example.demo.projections.ClienteProjection;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.ImovelRepository;

@RestController
public class ControllerImoveis {

	@Autowired
	private ImovelRepository apartamentosRepository;

//	
//	@GetMapping("/apartamentos")
//	public Page<Apartamentos> getImoveis(Pageable pageable){
//		return apartamentosRepository.findAll(pageable);
//				
//	}

	@GetMapping("/getApartamentos")
	public List<Imovel> getImoveis() {
		return apartamentosRepository.findAll();

	}

	@PostMapping("/saveApartamentos")
	public Imovel saveApartamento(@RequestBody Imovel apartamentos) {
		return apartamentosRepository.save(apartamentos);

	}

	@DeleteMapping("/deletartudo")
	public void deleteAp() {
		apartamentosRepository.deleteAll();

	}

	@GetMapping("/apartamento/{id}")
	public Imovel exbibiApartamento(@RequestBody Long id) {
		return apartamentosRepository.getReferenceById(id);

	}

	@GetMapping("/apartamentoByid/{id}")
	public Imovel getEmployeebyId(@PathVariable(value = "id") Long apartamentoId) {
		Imovel apartamento = apartamentosRepository.findById(apartamentoId).get();

		return apartamento;
	}

	@PutMapping("/updateapartamento/{id}")
	public ResponseEntity<Imovel> updateEmployee(@PathVariable(value = "id") Long Id,
			@RequestBody Imovel imovel) {
		Imovel apartamento = apartamentosRepository.findById(Id).get();

		apartamento.setEndereco(imovel.getEndereco());
		apartamento.setNumero(imovel.getNumero());
		final Imovel updatedApartamento = apartamentosRepository.save(apartamento);
		return ResponseEntity.ok(updatedApartamento);
	}

	
	
	
	
	
}
