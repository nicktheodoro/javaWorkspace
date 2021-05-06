package org.serratec.vetor;

public class App {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5 };
		int[] vetor2 = { 3, 0, 2 };
		int resultado;

		for (int i = 0; i < vetor.length; i++) {
				try {
					resultado = vetor[i] / vetor2[i];
					System.out.println(resultado);
				} catch (ArithmeticException e) {
					System.out.println("Impossível dividir 0");
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array menor");
				}

			}
		}

	}


