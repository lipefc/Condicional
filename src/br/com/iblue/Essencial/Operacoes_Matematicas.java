package br.com.iblue.Essencial;

public class Operacoes_Matematicas {
	
	public static void main(String[] args) {
		
		int num1 = 9, num2 = 4, res;
		float res2;
	
		//Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + res);
		
		//Subtração
		res = num1 - num2;
		System.out.println("A Subtração de " + num1 + " - " + num2 + " = " + res);
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A Multiplicação de " + num1 + " * " + num2 + " = " + res);
				
		//Divisão (Inteira)
		res = num1 / num2;
		System.out.println("A Divisão Inteira de " + num1 + " / " + num2 + " = " + res);
		
		//Divisão (Real)
		res2 = (float)num1 / (float)num2;
		System.out.println("A Divisão Real de " + num1 + " / " + num2 + " = " + res2);
		
		//Módulo
		res2 = num1 % num2;
		System.out.println("O Resto da Divisão de " + num1 + " por " + num2 + " = " + res2);
	}
}