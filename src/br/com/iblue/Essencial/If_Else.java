package br.com.iblue.Essencial;

public class If_Else {

	public static void main(String[] args) {
		
		int numero = 5;
		
		if(numero > 5) {
			System.out.println("Sim, o n�mero " + numero + " � maior que 5");
		}else if(numero == 5) {
			System.out.println("O n�mero " + numero + " � igual a 5");
		}else {
			System.out.println("N�o, o n�mero " + numero + " n�o � maior que 5");
		}
		
		
		if(numero % 2 == 0) {
			System.out.println("Sim, o n�mero " + numero + " � par");
		}else {
			System.out.println("N�o, o n�mero " + numero + " n�o � par");
		}
	}
}