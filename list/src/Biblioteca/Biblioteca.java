package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String resposavel;
	private List<Livro> listaLivros = new ArrayList<>();
	
	public String getResposavel() {
		return resposavel;
	}
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	
	public void adicionar(Livro livro) {
		listaLivros.add(livro);
	}
	
	public void listar() {
		for (Livro livro : listaLivros) {
			System.out.println(livro.toString());
		}
	}
	
	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
		int quantidade = 0;

		for (Livro livro : listaLivros) {
		if(livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
			quantidade++;
		}
	}
		return quantidade;		
	}
	
	public double calcularTotalLivros( ) {
		double total = 0;
		
		for (Livro livro : listaLivros) {
			total += livro.getPreco();
		}
		return total;
	}
}
