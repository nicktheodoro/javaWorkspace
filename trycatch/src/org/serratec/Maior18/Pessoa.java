package org.serratec.Maior18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private LocalDate idade;
	private String nome;
	
	public Pessoa(LocalDate idade, String nome) throws PessoaException {
		super();
		this.idade = idade;
		this.nome = nome;
		
		if(this.isDependenteMaiorDezoito(idade)) {
			throw new PessoaException();
		}
	}

	private int definirIdade(LocalDate dataNascimento) {
		LocalDate hoje = LocalDate.now();
		
		return Period.between(dataNascimento, hoje).getYears();
	}
	
	private boolean isDependenteMaiorDezoito(LocalDate dataNascimento) {
		return this.definirIdade(dataNascimento) >= 18;
	}

	public int getIdade() {
		return this.definirIdade(idade);
	}
	
	
}
