package org.serratec.exercicioCalc;

public abstract class BaseCalc implements InterfaceCalculadora {
	protected double numero1;
	protected double numero2;

	@Override
	public double somar() {
		double total = numero1 + numero2;
		return total;
	}
	
	@Override
	public double subtrair() {
		double total = numero1 - numero2;
		return total;
	}
	
	@Override
	public double multiplicar() {
		double total = numero1 * numero2;
		return total;
	}
	@Override
	public double dividir() {
		double total = numero1 / numero2;
		return total;
	}
	
	@Override
	public void operacao(int opr) {
		switch (opr) {
        case 1 :
            System.out.println(somar());
            break;
        case 2 :
            System.out.println(subtrair());
            break;
        case 3 :
        	 System.out.println(dividir());
             break;
        case 4 :
        	 System.out.println(multiplicar());
             break;
        case 5 :
        	break;
        default :
        	break;
		}
	}

}