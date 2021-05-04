package org.serratec.exercicioFuncPublico;

public class App {

	public static void main(String[] args) {

		FuncionarioPublico f1 = new FuncionarioPublico("Nicolas", 5000, 2002);
		FuncionarioPublico f2 = new FuncionarioPublico("William", 6000, 2006);
		FuncionarioPublico f3 = new FuncionarioPublico("Gux", 7000, 2010);

		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

	}

}
