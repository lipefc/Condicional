package br.com.iblue.Essencial;

public class Operacoes_Matematicas {
	
	public static void main(String[] args) {
		
		int num1 = 9, num2 = 4, res;
		float res2;
	
		//Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + res);
		
		//Subtra��o
		res = num1 - num2;
		System.out.println("A Subtra��o de " + num1 + " - " + num2 + " = " + res);
		
		//Multiplica��o
		res = num1 * num2;
		System.out.println("A Multiplica��o de " + num1 + " * " + num2 + " = " + res);
				
		//Divis�o (Inteira)
		res = num1 / num2;
		System.out.println("A Divis�o Inteira de " + num1 + " / " + num2 + " = " + res);
		
		//Divis�o (Real)
		res2 = (float)num1 / (float)num2;
		System.out.println("A Divis�o Real de " + num1 + " / " + num2 + " = " + res2);
		
		//M�dulo
		res2 = num1 % num2;
		System.out.println("O Resto da Divis�o de " + num1 + " por " + num2 + " = " + res2);
	}
}