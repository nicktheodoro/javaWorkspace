package org.serratec.exercicioLanchonete;

import java.time.LocalDate;

public class Pedido {
	private Bebidas bebida;
	private Sanduiches sanduiche;
	private LocalDate dataPedido;

	public Pedido(Bebidas bebida, Sanduiches sanduiche) {
		super();
		this.bebida = bebida;
		this.sanduiche = sanduiche;
		this.dataPedido = LocalDate.now();
	}

	public Bebidas getBebida() {
		return bebida;
	}

	public Sanduiches getSanduiche() {
		return sanduiche;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public static void imprimirCardapio() {
		System.out.println("Cárdapio");
		System.out.println("\nBebidas:\n");
		for (Bebidas beb : Bebidas.values()) {
			System.out.println(beb.getTipo() + " - R$" + beb.getValor());
		}
		System.out.println("\nSanduíches:\n");
		for (Sanduiches san : Sanduiches.values()) {
			System.out.println(san.getNome() + " - R$ " + san.getValor());
		}
		System.out.println("\n-----------------------------\n");
	}

	public double calcularPedido() {
		return this.bebida.getValor() + this.sanduiche.getValor();
	}

	@Override
	public String toString() {
		return "Pedido " + dataPedido 
				+ "\nBebida: " + bebida.getTipo() 
				+ "\nSanduíche: " + sanduiche.getNome();

	}

}
