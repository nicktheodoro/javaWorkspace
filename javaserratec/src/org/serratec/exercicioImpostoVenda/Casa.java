package org.serratec.exercicioImpostoVenda;

public class Casa extends Imovel{
	private boolean garagem;

	public Casa(String local, double valorImovel, boolean garagem) {
		super(local, valorImovel);
		this.garagem = garagem;
	}

	public boolean isGaragem() {
		return garagem;
	}
	
	@Override
	public String toString() {
		return garagem == true ?
				super.toString() +  "\nGaragem: Sim" 
				: 
				super.toString() + "\nGaragem: Não";
	}
	
}
