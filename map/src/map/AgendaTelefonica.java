package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
	Map<String, String> colecao = new HashMap<>();

	public void inserir(String nome, String telefone) {
		colecao.put(nome, telefone);
	}

	public void remover(String nome) {
		colecao.remove(nome);
	}

	public void buscarNumero(String nome) {
		System.out.println(colecao.get(nome));
	}

	public void mostrarAgenda() {
		for (Map.Entry<String, String> meuMap : colecao.entrySet()) {
			System.out.print(meuMap.getKey() + " -> ");
			System.out.print(meuMap.getValue() + "\n");
		}
	}

	public void tamanho() {
		System.out.println(colecao.size());
	}

}
