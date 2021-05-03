package org.serratec.exercicioProduto;

public class Produto {
	protected String nomeProduto;
	protected double valor;
	protected int quantidade;
	
	public Produto(String nomeProduto, double valor, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public String getInfos() {
		return "Descrição: " + nomeProduto 
				+ "\n"
				+ "Valor: " + valor;
	}
	
	public double Total() {
		double total = valor * quantidade;
		return total;
	}
	
	public double calcularIcms() {
		double icms = (valor * quantidade) * 0.12;
		return icms;
	}
	
}