package br.com.iblue.Essencial;

public class Foreach {
	
	public static void main(String[] args) {
		
		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caractere; Para cada letra 
		for (char letra : nome.toCharArray()) {
			System.out.print(letra);
			//System.out.println(letra);
		}
	}
}