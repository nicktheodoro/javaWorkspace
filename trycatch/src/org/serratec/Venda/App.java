package org.serratec.Venda;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Produto prod1 = new Produto(1, "Controle", 200, Categoria.ELETRONICO);
		Produto prod2 = new Produto(2, "Protetor Solar", 40, Categoria.FARMACEUTICO);
		Produto prod3 = new Produto(3, "Pneu", 300, Categoria.AUTOMOTIVO);
		Produto prod4 = new Produto(4, "Camisa Balenciaga", 5000, Categoria.ROUPAS);
				
		Venda venda1 = new Venda(prod1, LocalDate.now(), 10);
		Venda venda2 = new Venda(prod2, LocalDate.now(), 50);
		Venda venda3 = new Venda(prod3, LocalDate.now(), 3);
		Venda venda4 = new Venda(prod4, LocalDate.now(), 2);
		
		venda1.calcularVenda();
		venda2.calcularVenda();
		venda3.calcularVenda();
		venda4.calcularVenda();
		System.out.println("\nTotal Vendas : " + venda4.getTotalVenda());
	}
}
