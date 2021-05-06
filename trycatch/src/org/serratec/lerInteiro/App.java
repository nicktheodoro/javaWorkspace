package org.serratec.lerInteiro;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		try {
			int numeroLido = lerNumero();
			System.out.println("\nNúmero lido: " + numeroLido);
		} catch (Exception e) {
			System.out.println("\nFalha na leitura: " + e.getMessage());
		}
	}
	
	public static int lerNumero() throws Exception {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		scan.close();
		
		return num;
	}
}
