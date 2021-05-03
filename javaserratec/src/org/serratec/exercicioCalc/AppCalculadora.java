package org.serratec.exercicioCalc;

import java.util.Scanner;

public class AppCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Calculadora calc;

		int opr;

		do {
			System.out.println("Primeiro número: ");
			double numero1 = scan.nextDouble();

			System.out.println("Segundo número: ");
			double numero2 = scan.nextDouble();

			calc = new Calculadora(numero1, numero2);

			System.out.println("\nEscolha uma operaÇão\n" + "1 - Soma\n" + "2 - Subtração\n" + "3 - Divisão\n"
					+ "4 - Multiplicação\n" + "5 - Sair\n");

			opr = scan.nextInt();
			calc.operacao(opr);

		} while (opr < 5);

		scan.close();

	}
}
