package org.serratec.Venda;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto: " + produto.getDescricao()
				+ "\nValor: R$" + produto.getValor()
				+ "\nCategoria: " + produto.getCategoria()
				+ "\nQuantidade: " + quantidade 
				+ "\nTotal produto: " + getQuantidade() * produto.getValor() + "\n";
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		Venda.totalVenda += getQuantidade() * produto.getValor();
		mostrarVenda();
	}

	private void mostrarVenda() {
		System.out.println(toString());
	}

}
