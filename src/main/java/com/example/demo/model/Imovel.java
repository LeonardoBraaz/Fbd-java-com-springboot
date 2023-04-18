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



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="tb_imovel")
public class Imovel {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String endereco;
	private int numero;
	@ManyToOne
	@JoinColumn(name ="imovel_id")
	private Imobiliaria imobiliaria;

	
	
	
}
