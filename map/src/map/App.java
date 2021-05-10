package map;

public class App {

	public static void main(String[] args) {
		
		AgendaTelefonica agenda = new AgendaTelefonica();
		
		agenda.inserir("Nicolas", "9921313602");
		agenda.inserir("Will", "99312312313602");
		agenda.inserir("Jesse", "91231233602");
		agenda.inserir("Paula", "912313602");
		
		agenda.buscarNumero("Nicolas");
		
		agenda.remover("Will");

		agenda.mostrarAgenda();
		
		agenda.tamanho();
	}

}
