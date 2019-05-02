package com.testedoranieri.vendas;

import java.text.DateFormat;
import javax.persistence.*;

import com.testedoranieri.cliente.Cliente;
import com.testedoranieri.pecas.Pecas;

@Entity
@Table(name="vendas")

public class Venda {

	@Id
	@GeneratedValue
	private Integer pedido;
	@ManyToOne
	@JoinColumn(name="id_Cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="id_peca", nullable = false)
	private Pecas pecas;
	private DateFormat data;
	
	public Integer getPedido() {
		return pedido;
	}
	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pecas getPecas() {
		return pecas;
	}
	public void setPecas(Pecas pecas) {
		this.pecas = pecas;
	}
	public DateFormat getData() {
		return data;
	}
	public void setData(DateFormat data) {
		this.data = data;
	}
	
	
}
