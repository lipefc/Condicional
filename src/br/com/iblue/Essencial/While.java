package br.com.iblue.Essencial;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para Receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Sempre checa o valor antes de executar o bloco
		while(idade > 0) {
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