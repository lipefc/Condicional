package br.com.iblue.Essencial;

public class Funcao_Propria2 {

	public static void main(String[] args) {
		
		int valor1 = 6, valor2 = 4, resposta;
		
		resposta = soma(valor1, valor2);
		
		System.out.println("O resultado é = " + resposta);
		System.out.println("O resultado é = " + soma(valor1, valor2));
		
		System.out.println(mensagem());
	}
	
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
	static String mensagem() {
		return "Olá Usuario";
	}
}