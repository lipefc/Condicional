package br.com.iblue.Essencial;

public class If_Else {

	public static void main(String[] args) {
		
		int numero = 5;
		
		if(numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5");
		}else if(numero == 5) {
			System.out.println("O número " + numero + " é igual a 5");
		}else {
			System.out.println("Não, o número " + numero + " não é maior que 5");
		}
		
		
		if(numero % 2 == 0) {
			System.out.println("Sim, o número " + numero + " é par");
		}else {
			System.out.println("Não, o número " + numero + " não é par");
		}
	}
}