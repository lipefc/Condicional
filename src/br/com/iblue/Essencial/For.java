package br.com.iblue.Essencial;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		//Para Receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Vari�vel de controle; Condi��o de parada; Forma de incremento;
		for(int i = 0; i < 5; i++) {
			System.out.println("\nInforma seu nome: ");
			nome = teclado.nextLine();
		
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //Bug
			idade = Integer.parseInt(teclado.nextLine());
		
			if(idade > 0)
				System.out.println(nome + " tem " + idade + " anos!");
		}
		
		teclado.close();
	}
}