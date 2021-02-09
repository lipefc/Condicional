package br.com.iblue.Essencial;

public class Booleans {

	public static void main(String[] args) {
	
		//Tipos Primários
		boolean verdadeiro = true; //1
		boolean falso = false; //0
			
		//Tipos Não Primários
		Boolean v = true; 
		Boolean f = false; 
		
		boolean ativo = false;
		
		System.out.println("Verdadeiro = " + verdadeiro);
		System.out.println("falso = " + falso);
		System.out.println("V = " + v);
		System.out.println("F = " + f);
		
		if(verdadeiro) {
			System.out.println("É Verdadeiro");
		}else {
			System.out.println("É Falso");
		}
		
		if(1 == 3) {
			System.out.println("1 == 1 é Verdadeiro");
		}else {
			System.out.println("... é Falso");
		}
		
		if(ativo) {
			System.out.println("Pode acessar o sistema");
		}else {
			System.out.println("Acesso negado");
		}
	}
}