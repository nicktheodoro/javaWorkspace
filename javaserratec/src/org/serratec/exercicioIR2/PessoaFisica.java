package org.serratec.exercicioIR2;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf, rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String calculoIR() {
		Double ir_pf = rendimentos * 0.12;
		this.rendimentos -= ir_pf; 
		return ir_pf.toString();
	}
	
	public String showInfos() {
		return "Pessoa Física\n" 
				+ "\nCPF: " + cpf 
				+ "\nRG: " + rg 
				+ "\nNome: " + nome
				+ "\nRenda Bruta: R$" + rendimentos
				+"\nIR: R$" + calculoIR().toString()
				+ "\nRenda Líquida: R$" + rendimentos;
	}
		
}