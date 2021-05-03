package com.superMercado;

public class Produto extends Estoque {
	protected int codProduto, qtdProduto;
	protected String nomeProduto;
	protected double precoProduto;
	protected int qtd;
	
	public Produto(int codProduto, String nomeProduto, double precoProduto,  int qtd) {
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto
				+ "]";
	}
	
	
}
