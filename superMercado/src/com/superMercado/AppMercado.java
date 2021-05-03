package com.superMercado;

public class AppMercado {

	public static void main(String[] args) {
		
		Produto produtoTeste = new Produto(1, "Arroz", 14, 0);
		Produto produtoTeste2 = new Produto(2, "Feijão", 12, 0);
		Produto produtoTeste3 = new Produto(3, "Mamão", 3, 150);
		
		Estoque estoque = new Estoque();
		
		estoque.CadastrarProduto(produtoTeste, 10);
		estoque.CadastrarProduto(produtoTeste, 100);
		estoque.CadastrarProduto(produtoTeste, 100);
		estoque.CadastrarProduto(produtoTeste2, 100);
		estoque.CadastrarProduto(produtoTeste2, 10);
		estoque.CadastrarProduto(produtoTeste2, 200);
		estoque.CadastrarProduto(produtoTeste3, 0);
		
		estoque.produtosCadastrados();
	
	}

}
