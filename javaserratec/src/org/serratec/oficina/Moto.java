package org.serratec.oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.setCilindradas(cilindradas);
	}

	@Override
	public double lavarVeiculo() {
		double valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
		System.out.println("Preço da lavagem: " + valorCobrado);

		return super.valorCobrado += valorCobrado;
	}

	@Override
	public double trocarOleo() {
		double valorCobrado = TipoServico.OLEO.getValorPorServico();
		System.out.println("Preço da troca de óleo: " + valorCobrado);

		return super.valorCobrado += valorCobrado;
	}

	@Override
	public double revisao() {
		double valorCobrado = TipoServico.REVISAO.getValorPorServico();
		System.out.println("Preço da revisão: " + valorCobrado);

		return super.valorCobrado += valorCobrado;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
}