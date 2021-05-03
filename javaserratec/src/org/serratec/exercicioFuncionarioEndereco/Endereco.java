package org.serratec.exercicioFuncionarioEndereco;

public class Endereco {
	private String rua, bairro;
	private int numero;
	private int cep;
	
	public Endereco(String rua, String bairro, int numero, int cep) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
	}
	
	

	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getCep() {
		return cep;
	}



	public void setCep(int cep) {
		this.cep = cep;
	}



	@Override
	public String toString() {
		return "Endereço [ Rua = " + rua + ", Bairro = " + bairro + ", Número = " + numero + ", CEP = " + cep + " ]";
	}
	
}