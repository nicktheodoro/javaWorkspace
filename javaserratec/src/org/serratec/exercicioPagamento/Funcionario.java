package org.serratec.exercicioPagamento;

public class Funcionario {
	protected String nome, cpf, turno;
	protected double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	public double aumentarSalario() {
		return this.salario = salario * 1.02;
	}
}