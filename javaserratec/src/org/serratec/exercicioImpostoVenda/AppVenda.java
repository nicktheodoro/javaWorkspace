package org.serratec.exercicioImpostoVenda;

public class AppVenda {
	public static void main(String[] args) {
		Imovel imovelcasa = new Casa("Alto", 890000, true);
		Imovel imovelapt = new Apto("Várzea", 350000, 4);

		Proprietario p1 = new Proprietario("Will", imovelapt);
		Proprietario p2 = new Proprietario("Guxtagol", imovelcasa);

		System.out.println("Proprietário: " + p1.getNome());
		System.out.println(imovelcasa.toString());
		System.out.printf("ITBI: R$%.2f", imovelcasa.calcularImpostoVenda());

		System.out.println("\n\nProprietário: " + p2.getNome());
		System.out.println(imovelapt.toString());
		System.out.printf("ITBI: R$%.2f", imovelapt.calcularImpostoVenda());

	}

}
