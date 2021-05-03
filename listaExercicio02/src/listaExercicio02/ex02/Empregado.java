package listaExercicio02.ex02;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;

	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;

	}

	public void setSalario(double salario) {
		this.salario = salario < 0 ? 0 : salario;
	}

	public void aumentarSalario() {
		this.salario += salario * 0.1;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " " + sobrenome + "\nSalário: " + salario;
	}
}
