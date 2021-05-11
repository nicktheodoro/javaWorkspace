package org.serratec.Maior18;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		try {
			Pessoa p1 = new Pessoa(LocalDate.of(2003, 5, 11), "Nicolas");
			System.out.println(p1.getIdade());
		} catch (PessoaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
