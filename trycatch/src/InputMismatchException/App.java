package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número inteiro: ");
			int numero = scan.nextInt();
			System.out.println("\n" + numero);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan.close();
	}
}
