package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_cliente")
public class Cliente {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@ManyToOne
		@JoinColumn(name="endereco_cep")
		private Endereco endereco;
		private String cpf;
		private String nome;
		private String numeroTelefone;
	
		
		
		public Cliente(String cpf) {
			this.cpf = cpf;
		}
		
		
		
		
	
		
		
		
		
}
