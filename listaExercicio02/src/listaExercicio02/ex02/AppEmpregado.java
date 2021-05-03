package listaExercicio02.ex02;

public class AppEmpregado {
	
	public static void main(String[] args) {

		Empregado e1 = new Empregado("Nicolas", "Theodoro", 100000);
		Empregado e2 = new Empregado("Will", "Filgueiras", 50000);

		System.out.println(e1.toString());
		System.out.println("\n" + e2.toString());

		e2.setNome("Flávio");
		e2.setSobrenome("Silva");
		e2.setSalario(30000);

		e1.aumentarSalario();
		e2.aumentarSalario();

		System.out.println("\n" + e1.toString());
		System.out.println("\n" + e2.toString());
	}
}
