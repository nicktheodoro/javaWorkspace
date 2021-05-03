package org.serratec.exercicioContato;

import java.util.Arrays;

public class Contato {
	private String nome;
	Telefone[] telefones;
	
	public Contato(String nome, Telefone[] telefones) {
		super();
		this.nome = nome;
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefones=" + Arrays.toString(telefones) + "]";
	}
	
	
}
