package org.serratec.exercicioLanchonete;

public class App {

	public static void main(String[] args) {
		
		Pedido.imprimirCardapio();
		System.out.println("Vou fazer o pedido....\n");
		
		Pedido pedido1 = new Pedido(Bebidas.SUCO, Sanduiches.SANDUICHE_DE_PATE);
				
		System.out.println(pedido1.toString());
		System.out.println("\nTotal do Pedido: R$" + pedido1.calcularPedido());
	}

}
