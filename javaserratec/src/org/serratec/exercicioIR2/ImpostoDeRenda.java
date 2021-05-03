package org.serratec.exercicioIR2;

public class ImpostoDeRenda {
	protected String nome, telefone, email;
	protected double rendimentos;
	
	public ImpostoDeRenda(String nome, double redimentos) {
		this.nome = nome;
		this.rendimentos = redimentos;
	}

	public double getRendimentos() {
		return rendimentos;
	}
	
	
}