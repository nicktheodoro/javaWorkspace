package org.serratec.UpperCase;

public class App {
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String palavra = null;
		
		try {
			palavra.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("Váriavel nula");
		}

	}

}
