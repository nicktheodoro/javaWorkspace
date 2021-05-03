package org.serratec.exercicioPagamento;

public class Gerente extends Funcionario {
	private String setor;
	
	public Gerente(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}
	
	
	public double aumentarSalario() {
		return this.salario = super.aumentarSalario() + 200;
	}

	@Override
	public String toString() {
		return "Gerente [setor=" + setor + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
}