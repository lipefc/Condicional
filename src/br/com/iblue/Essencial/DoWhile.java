package br.com.iblue.Essencial;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		//Para Receber dados do usu�rio via teclado.
		Scanner teclado = new Scanner(System.in);
		
		//Primeiro executa o bloco, depois faz a checagem.
		do{
			System.out.println("\nInforma seu nome: ");
			nome = teclado.nextLine();
		
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //Bug
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0)
				System.out.println(nome + " tem " + idade + " anos!");
			
		}while(idade > 0);
		
		teclado.close();
	}
}