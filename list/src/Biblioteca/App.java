package Biblioteca;

public class App {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Mar de monstros", "Rick Riordan", 30);
		Livro livro2 = new Livro("O ladrão de raios", "Rick Riordan", 20);
		Livro livro3 = new Livro("A maldição do Titan", "Rick Riordan", 35);
		Livro livro4 = new Livro("A Batalha do Labirinto", "Rick Riordan", 45);
		Livro livro5 = new Livro("O último Olimpiano", "Rick Riordan", 55);
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.adicionar(livro1);
		biblioteca.adicionar(livro2);
		biblioteca.adicionar(livro3);
		biblioteca.adicionar(livro4);
		biblioteca.adicionar(livro5);

		biblioteca.listar();
		System.out.println("\nTotal de Livros: " + biblioteca.calcularTotalLivros());
		System.out.println("\nTotal de Livros na faixa: " + biblioteca.pesquisarFaixaDePreco(30, 100));
	}

}
