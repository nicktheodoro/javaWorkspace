package org.serratec.exercicioFuncPublico;

public class FuncionarioPublico {
	private String nome;
	private double salario;
	private final int anoConcurso;

	public FuncionarioPublico(String nome, double salario, int anoConcurso) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.anoConcurso = anoConcurso;
	}

	@Override
	public String toString() {
		return "FuncionarioPublico [nome=" + nome + ", salario=" + salario + ", anoConcurso=" + anoConcurso + "]";
	}

}
