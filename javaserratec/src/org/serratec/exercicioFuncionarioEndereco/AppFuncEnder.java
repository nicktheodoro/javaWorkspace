package org.serratec.exercicioFuncionarioEndereco;

public class AppFuncEnder {
	
	public static void main(String[] args) {
		Endereco e = new Endereco("Rua das Flores, ", "Lapa, ", 120, 25955555);
		
		Funcionario f = new Funcionario("Nicolas", 1234567890, e);
		
		System.out.println(f.toString());
		
	}
	
}