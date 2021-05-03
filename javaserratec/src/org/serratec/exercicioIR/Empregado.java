package org.serratec.exercicioIR;

public class Empregado {
	private String nome, sobrenome;
	private double salario;
	
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void calcularImpostoRenda() {
		if(salario <= 1903.98) {
			
		} else if(salario <= 2826.65) {
			this.salario = salario - (salario * 0.075);
		} else if(salario <= 3751.05) {
			this.salario = salario - (salario * 0.15);
		} else if(salario <= 4664.68) {
			this.salario = salario - (salario * 0.225);
		} else {
			this.salario = salario - (salario * 0.275);
		}
	}
}