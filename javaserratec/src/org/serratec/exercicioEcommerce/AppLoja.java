package org.serratec.exercicioEcommerce;

import java.time.LocalDate;

public class AppLoja {
	
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1, LocalDate.of(2021, 4, 29), 2, 5);
		Pedido pedido2 = new Pedido(2, LocalDate.of(2021, 04, 25), 10, 10);
	    Pedido pedido3 = new Pedido(3, LocalDate.of(2021, 05, 02), 8, 7);
		
		System.out.println("Número pedido: " + pedido1.getNumero());
		System.out.println("Data Pedido: " + pedido1.getDataPedido());
		System.out.println("Quantidade: " + pedido1.getQuantidade());
		System.out.println("Valor : " + pedido1.getValor());
		System.out.println("Total pedido: " + pedido1.finalizarPedido());
		
		System.out.println("\nNúmero pedido: " + pedido2.getNumero());
		System.out.println("Data Pedido: " + pedido2.getDataPedido());
		System.out.println("Quantidade: " + pedido2.getQuantidade());
		System.out.println("Valor : " + pedido2.getValor());
		System.out.println("Total pedido: " + pedido2.finalizarPedido());
		
		System.out.println("\nNúmero pedido: " + pedido3.getNumero());
		System.out.println("Data Pedido: " + pedido3.getDataPedido());
		System.out.println("Quantidade: " + pedido3.getQuantidade());
		System.out.println("Valor : " + pedido3.getValor());
		System.out.println("Total pedido: " + pedido3.finalizarPedido());
	}
	
}
