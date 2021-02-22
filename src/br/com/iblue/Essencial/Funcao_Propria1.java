/*
 * Faça um programa que receba diversos nome de frutas do usuário e no final imprima
 * essas frutas em ordem contrária. O programa deve solicitar ao usuário quantas frutas
 * ele quer informar.
 */
package br.com.iblue.Essencial;

import java.util.Scanner;

public class Funcao_Propria1 {
	
	static Scanner teclado = new Scanner(System.in);
	static String frutas[]; //Declaração do vetor.
	
	public static void main(String[] args) {

		int quantidade;
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		quantidade = Integer.parseInt(teclado.nextLine());
		
		cadastrarDados(quantidade);
		System.out.println();
		mostrarDados(quantidade);
		teclado.close();
	}
	
	/*Uma função deve ter o seguinte:
	 * a)Tipo de retorno (Tipo de dado que a função vai retornar);
	 * b)Nome;
	 * c)Parâmetros/Argumentos de entrada (Opcicional)
	 * d)Retorno (Opcional - Depende do tipo de retorno);
	 */
	static void cadastrarDados(int quantidade) {
		
		//Definindo o tamanho do vetor.
		frutas = new String[quantidade];
			
		for(int i = 0; i < quantidade; i++) {	//i++ -> i = i + 1.
			System.out.println("Informe a " + (i + 1) + "ª fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrarDados(int quantidade) {
		
		for(int i = (quantidade -1); i >= 0; i--) {	//i-- -> i = i - 1.
			System.out.println(frutas[i]);
		}
	}
}