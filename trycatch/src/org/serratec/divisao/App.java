package org.serratec.divisao;

public class App {
	

	public static void main(String[] args) {
		double total;
		
		try {
			total = 20 / 0;
			System.out.println(total);
		} catch (ArithmeticException e) {
			
			System.out.println("Impossível fazer divisão");
		}

	}

}
