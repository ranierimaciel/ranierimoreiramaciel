package com.testedoranieri.cliente;

import javax.persistence.*;

@Entity
@Table(name="cliente")

public class Cliente {

	@Id
	@GeneratedValue
	private Integer Id;
	private String cpf;	
	private String nome;	
	private String email;	
	private String endereco;
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
