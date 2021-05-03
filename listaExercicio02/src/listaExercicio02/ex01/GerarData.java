package listaExercicio02.ex01;

import java.time.LocalDate;

public class GerarData {
	private int dia;
	private int mes;
	private int ano;
	private LocalDate data;

	public GerarData() {
		data = LocalDate.now();

		this.dia = data.getDayOfMonth();
		this.mes = data.getMonthValue();
		this.ano = data.getYear();
	}

	public GerarData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

		data = LocalDate.of(ano, mes, dia);
	}

	public void nextDay() {
		LocalDate nextDay = data.plusDays(1);

		this.dia = nextDay.getDayOfMonth();
		this.mes = nextDay.getMonthValue();
		this.ano = nextDay.getYear();
		System.out.println(toString());
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
