package org.serratec.exercicioIR;

public class AppIR {
	
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("José", "Silva", 10000);
		Empregado empregado2 = new Empregado("Joaquim", "Medeiros", 12000);
		
		double salarioBruto = empregado1.getSalario();
		double salarioBruto2 = empregado2.getSalario();
		
		empregado1.calcularImpostoRenda();
		System.out.println("Nome: " + empregado1.getNome()
							+"\nSalário bruto: " + salarioBruto
							+"\nSalário líquido: " + empregado1.getSalario());
		
		empregado2.calcularImpostoRenda();
		System.out.println("\nNome: " + empregado2.getNome()
							+"\nSalário bruto: " + salarioBruto2
							+"\nSalário líquido: " + empregado2.getSalario());
	}
}