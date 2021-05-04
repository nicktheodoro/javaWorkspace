package org.serratec.exercicioLanchonete;

public enum Sanduiches {
	SANDUICHE_DE_LINGUICA("Sanduíche de linguiça", 12.99), 
	SANDUICHE_DE_PATE("Sanduíche de Pate", 10.49), 
	SANDUICHE_DE_PRESUNTO("Sanduíche de Preseunto", 9.49);

	private final String nome;
	private final double valor;
	
	Sanduiches(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
	
}
