package org.serratec.exercicioLanchonete;

public enum Bebidas {
	SUCO("Suco Natural", 4),
	REFRIGERANTE("Refrigerante", 5.50),
	GUARAVITA("Guaravita", 2.50);
	
	private final String tipo;
	private final double valor;

	Bebidas(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

}
