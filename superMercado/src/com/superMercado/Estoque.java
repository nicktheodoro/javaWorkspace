package com.superMercado;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<Produto> produtosEmEstoque = new ArrayList<>();
	
	public void CadastrarProduto(Produto produto, int qtdProdutos) {
		
		if(produtosEmEstoque.contains(produto)) {
			produto.qtd += qtdProdutos;
		} else {
			produto.qtd += qtdProdutos;
			produtosEmEstoque.add(produto);
		}
	}

	public void produtosCadastrados() {
		for (Produto produto : produtosEmEstoque) {
			System.out.println("Produto: " + produto.nomeProduto
								+"\nPreço: " + produto.precoProduto
								+"\nQuantidade Estoque: " + produto.qtd
								+ "\n");
		}
	}

	
	
	
}
