package org.serratec.exercicioIR2;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj, inscEstadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	public String calculoIR() {
		Double ir_pf = rendimentos * 0.15;
		this.rendimentos -= ir_pf; 
		return ir_pf.toString();
	}
	
	public String showInfos() {
		return "Pessoa Jurídica\n" 
				+ "\nCNPJ: " + cnpj 
				+ "\nIncrição Estadual: " + inscEstadual
				+ "\nNome: " + nome
				+ "\nLucro bruto : R$" + rendimentos
				+"\nIR: R$" + calculoIR().toString()
				+ "\nLucro líquido: R$" + rendimentos;
	}
	
	
}