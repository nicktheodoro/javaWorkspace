package org.serratec.exercicioPagamento;

public class Assistente extends Funcionario {
	private double adicional;
	
	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}
	
	
	public double aumentarSalario() {
		return this.salario = super.aumentarSalario() + this.adicional;
	}

	@Override
	public String toString() {
		return "Assistente [adicional=" + adicional + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
}