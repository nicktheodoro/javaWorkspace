package org.serratec.exercicioProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		
		Scanner scan = new Scanner(System.in);
		
		String resp = "";
		
		do {
			System.out.println("Nome Produto: ");
			String nome = scan.next();
			
			System.out.println("Valor: ");
			double valor = scan.nextDouble();
			
			System.out.println("Qtd: ");
			int qtd = scan.nextInt();
			
			Produto produto = new Produto(nome, valor, qtd);
			
			produtos.add(produto);
			
			System.out.println("\nDeseja Cadastrar outro produto? ");
			resp = scan.next();
		} while(resp.equalsIgnoreCase("S"));
		
		scan.close();
		
		for (Produto produto : produtos) {
			System.out.println("\n" + produto.getInfos());
			System.out.println("Total: " + produto.Total());
			System.out.println("Icms: " + produto.calcularIcms());
		}	
	}
	
}