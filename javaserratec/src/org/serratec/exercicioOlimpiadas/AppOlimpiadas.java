package org.serratec.exercicioOlimpiadas;

public class AppOlimpiadas {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("Argentina");

		Atleta atleta1 = new Atleta("Nicolas", 72, "Boxe", pais1);
		Atleta atleta2 = new Atleta("GuxtaGol", 55, "Karatê", pais1);
		Atleta atleta3 = new Atleta("Will", 110, "Luta Livre", pais2);

		atleta1.verificaSituacao();
		atleta2.verificaSituacao();
		atleta3.verificaSituacao();

		System.out.println(atleta1.toString());
		System.out.println("\n" + atleta2.toString());
		System.out.println("\n" + atleta3.toString());
		System.out.println("\nTotal de participantes: " + Atleta.getTotalParticipantes());

	}

}
