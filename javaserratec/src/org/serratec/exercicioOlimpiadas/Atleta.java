package org.serratec.exercicioOlimpiadas;

public class Atleta implements Olimpiadas {
	private String nome;
	private String modalidade;
	private static int totalParticipantes;
	private double peso;
	private Pais pais;

	public Atleta(String nome, double peso, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.pais = pais;
		totalParticipantes++;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public double getPeso() {
		return peso;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			setModalidade("Peso pesado");
			return "Participa";
		} else if (peso > 60) {
			setModalidade("Peso médio");
			return "Participa";
		} else {
			return "Não participa";
		}
	}

	@Override
	public String toString() {
		return "Nome: " + nome 
				+ "\nModalidade: " + modalidade 
				+ "\nPeso: " + peso 
				+ "\nPaís: " + pais.getNome()
				+ "\nSituação: " + verificaSituacao();
	}

}
