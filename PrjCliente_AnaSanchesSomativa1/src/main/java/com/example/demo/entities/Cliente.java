package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // é uma entidade
@Table(name = "cliente")//nomea a tabela
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int idade;

	///////ID///////////
	public Long getId() {
	return id;
	}
		
	public void setId(Long id) {
	this.id = id;
	}
	
	////////Nome///////
	public String getNome() {
	return nome;
	}
			
	public void setNome(String nome) {
	this.nome = nome;
	}
	
	
    ///////Idade//////////////////
	public int getIdade() {
	return idade;
	}
					
	public void setIdade(int idade) {
	this.idade = idade;
	}
	
}

