package com.testedoranieri.pecas;
import javax.persistence.*;

@Entity
@Table(name="pecas")

public class Pecas {
	
	@Id
	@GeneratedValue
	private Integer partnumber;
	private String descricao;	
	private String observacao;	
	private String categoria;	
	
	public Integer getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(Integer partnumber) {
		this.partnumber = partnumber;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
