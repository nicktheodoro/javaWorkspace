package org.serratec.exercicioEcommerce;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	
	private LocalDate dataPedido;
	private int numero, quantidade;
	private double valor, total;
	
	public Pedido(int numero, LocalDate dataPedido, int quantidade, double valor) {
	
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		this.total = valor;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public int getNumero() {
		return numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}
	
	public double finalizarPedido() {
		if(this.dataPedido.getDayOfWeek() == DayOfWeek.SUNDAY) {
			this.valor = valor - valor * 0.1;
			this.total = quantidade * valor;
			return total;
		} else {
			this.total = quantidade * valor;
			return total;
		}	
	}
}
