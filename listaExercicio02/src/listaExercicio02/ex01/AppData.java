package listaExercicio02.ex01;

public class AppData {
	public static void main(String[] args) {

		GerarData data1 = new GerarData();
		GerarData data2 = new GerarData(11, 10, 1993);

		GerarData data3 = new GerarData();

		System.out.println(data1.toString());
		System.out.println(data2.toString());

		data1.nextDay();
		data2.nextDay();

		data3.setDia(15);
		data3.setMes(11);
		data3.setAno(2022);
		System.out.println(data3.toString());

		data3.setAno(2021);
		System.out.println(data3.toString());

		System.out.println(data3.getDia());
		System.out.println(data2.getAno());
		System.out.println(data1.getMes());

	}
}
