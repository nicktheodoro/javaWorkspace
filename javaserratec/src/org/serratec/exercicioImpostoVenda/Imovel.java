package org.serratec.exercicioImpostoVenda;

public class Imovel {
	protected String local;
	private double valorImovel;

	public Imovel(String local, double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}

	public double calcularImpostoVenda() {
		double itbi = this.valorImovel * 0.035;
		return itbi;
	}

	@Override
	public String toString() {
		return "Local: " + local + "\nValor Imóvel: R$" + valorImovel;
	}

}
