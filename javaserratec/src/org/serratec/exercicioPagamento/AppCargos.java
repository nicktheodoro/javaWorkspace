package org.serratec.exercicioPagamento;

public class AppCargos {

	public static void main(String[] args) {
		
		Gerente funcionario1 = new Gerente("Nicolas", 10000, "Vendas");
		Assistente funcionario2 = new Assistente("Will", 1000, 300);
		
		funcionario1.aumentarSalario();
		funcionario2.aumentarSalario();
		
		System.out.println(funcionario1.toString());
		System.out.println(funcionario2.toString());
	}
}