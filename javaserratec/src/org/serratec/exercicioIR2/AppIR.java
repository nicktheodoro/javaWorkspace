package org.serratec.exercicioIR2;

public class AppIR {

	public static void main(String[] args) {
		PessoaFisica pessoa1 = new PessoaFisica("Matheus", 3000, "12345678990", "123456785");
        PessoaJuridica pessoa2 = new PessoaJuridica("Adriana Ltda.", 100000, "34567891990", "4212321185");
        
        
        System.out.println(pessoa1.showInfos());
        
        System.out.println("\n" + pessoa2.showInfos());
	}

}