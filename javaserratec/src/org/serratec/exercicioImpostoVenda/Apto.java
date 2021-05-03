package org.serratec.exercicioImpostoVenda;

public class Apto extends Imovel {
	private int andar;

	public Apto(String local, double valorImovel, int andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	public int getAndar() {
		return andar;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAndar: " + andar;
	}

}
