package br.com.iblue.Essencial;

public class Switch {

	public static void main(String[] args) {
		
		int numero = 3;
		
		switch (numero) {
			case 1:
				System.out.println("O num�ro � 1");
				break;
			case 3:
				System.out.println("O num�ro � 3");
				break;
			case 5:
				System.out.println("O num�ro � 5");
				break;
			default:
				System.out.println("[Default] O num�ro � " + numero);
			break;
		}
	}
}