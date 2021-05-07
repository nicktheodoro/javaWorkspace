package exerciciosCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente;
		
		Scanner scan = new Scanner(System.in);
		
		int id;
		String nome;
		int idade;
		String telefone;
		
		do {
			
			System.out.println("Digite o id do cliente: ");
			id = scan.nextInt();
			
			if(id < 0) {
				break;
			}
			
			System.out.println("Digite o nome do cliente: ");
			nome = scan.next();
			
			System.out.println("Digite a idade do cliente: ");
			idade = scan.nextInt();
			
			System.out.println("Digite o telefone do clinte: ");
			telefone = scan.next();
			
			cliente = new Cliente(id, nome, idade, telefone);
			clientes.add(cliente);
			
			
		} while(id > 0);
		
		scan.close();
		
		for (Cliente cliente2 : clientes) {
			System.out.println(cliente2);
		}

	}

}
