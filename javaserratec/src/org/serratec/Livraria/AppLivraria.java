package org.serratec.Livraria;

public class AppLivraria {

	public static void main(String[] args) {
		Livro livro1 = new Livro("J.R.R. Tolkien", "O hobbit", 60);
		Livro livro2 = new Livro("Geroge R.R.", "A rotmenta de espadas", 75);
		
		Operacao opr1 = new Operacao("Vender Livro", livro1);
		opr1.venderLivro();
		
		Operacao opr2 = new Operacao("Emprestar", livro2);
		opr2.emprestarLivro();
		
		System.out.println(opr1);
		System.out.println("\n" + opr2);

	}

}
