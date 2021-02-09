package br.com.iblue.Essencial;

public class Alfanumericos {

	public static void main(String[] args) {
		
		//Tipos Primários
		char letra1 = 'a'; //Aspas Simples
		char letra2 = 97;
		
		System.out.println("Letra2 = " + letra2);
		
		letra2 = (char) (letra2 + 1);
		
		System.out.println("Letra1 = " + letra1);
		System.out.println("Letra2 = " + letra2);
		
		//Tipos Não Primários
		Character letra3 = 'A';
		String nome = "Geek University";
		
		System.out.println("Letra3 = " + letra3);
		System.out.println();
		System.out.println("char/Character ->" + Character.SIZE + " bits");
		System.out.println();
		System.out.println("Valor Min char/Character " + Character.MIN_VALUE);
		System.out.println("Valor Max char/Character " + Character.MAX_VALUE);
		System.out.println();
		System.out.println("Nome = " + nome);
		System.out.println();
		System.out.println("Tamanho da String = " + nome.length());
		System.out.println();
		System.out.println("String = " + Character.SIZE * nome.length() + " bits");
	}
}