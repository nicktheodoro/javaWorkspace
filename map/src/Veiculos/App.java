package Veiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	static Map<String, String> veiculos = new HashMap<>();
	private static String modelo;
	private static String marca;
	private static String resp;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite uma marca de veículo: ");
			marca = scan.next();
			
			System.out.println("Digite o modelo do veículo: ");
			modelo = scan.next();
			
			veiculos.put(marca, modelo);
			
			System.out.println("Deseja cadastrar outro veículo?");
			resp = scan.next();
		} while(resp.equals("s"));

		scan.close();
		System.out.print("\n");
		
		for (Map.Entry<String, String> meuMap : veiculos.entrySet()) {
			System.out.print(meuMap.getKey() + " - ");
			System.out.print(meuMap.getValue() + "\n");
		}
	}

}
