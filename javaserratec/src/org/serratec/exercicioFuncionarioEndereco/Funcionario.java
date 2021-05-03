package org.serratec.exercicioFuncionarioEndereco;

public class Funcionario {
	protected String nome;
	protected int cpf;
	private Endereco endereco;

	public Funcionario(String nome, int cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
}