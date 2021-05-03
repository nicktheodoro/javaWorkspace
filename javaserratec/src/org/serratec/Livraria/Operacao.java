package org.serratec.Livraria;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}
	
	public void venderLivro() {
		 this.valorOperacao = livro.getValor() + (livro.getValor() * 0.09);
	}
	
	public void emprestarLivro() {
		this.valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;
	}

	@Override
	public String toString() {
		return livro.toString()
				+ "\nOperação [ tipo: " + tipo + ", valor Operação: R$" + valorOperacao + " ]";
	}
	
	
}
