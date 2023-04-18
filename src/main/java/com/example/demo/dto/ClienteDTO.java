package com.example.demo.dto;

import com.example.demo.model.Endereco;
import com.example.demo.projections.ClienteProjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {

	private String nome;
	private String cpf;
	private String numeroTelefone;
	private Long endereco;
	
	
	
	
	public ClienteDTO(ClienteProjection projection) {
		this.nome = projection.getNome();
		this.cpf = projection.getCpf();
		this.numeroTelefone = projection.getNumero_telefone();
		this.endereco = projection.getEndereco_cep();
	}
	
	
	
	
	
}
