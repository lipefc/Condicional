package br.com.iblue.Essencial;

public class Booleans {

	public static void main(String[] args) {
	
		//Tipos Prim�rios
		boolean verdadeiro = true; //1
		boolean falso = false; //0
			
		//Tipos N�o Prim�rios
		Boolean v = true; 
		Boolean f = false; 
		
		boolean ativo = false;
		
		System.out.println("Verdadeiro = " + verdadeiro);
		System.out.println("falso = " + falso);
		System.out.println("V = " + v);
		System.out.println("F = " + f);
		
		if(verdadeiro) {
			System.out.println("� Verdadeiro");
		}else {
			System.out.println("� Falso");
		}
		
		if(1 == 3) {
			System.out.println("1 == 1 � Verdadeiro");
		}else {
			System.out.println("... � Falso");
		}
		
		if(ativo) {
			System.out.println("Pode acessar o sistema");
		}else {
			System.out.println("Acesso negado");
		}
	}
}