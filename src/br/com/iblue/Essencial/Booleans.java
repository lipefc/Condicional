package br.com.iblue.Essencial;

public class Booleans {

	public static void main(String[] args) {
	
		//Tipos Prim�rios
		boolean verdadeiro = true; //23.40
		boolean falso = false; //23.454984654186465486465484658454
			
		//Tipos N�o Prim�rios
		Boolean v = true; //1
		Boolean f = false; //0
		
		boolean ativo = true;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);
		
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