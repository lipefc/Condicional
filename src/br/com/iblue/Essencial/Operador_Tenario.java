package br.com.iblue.Essencial;

public class Operador_Tenario {

	public static void main(String[] args) {
		
		int valor = 3, numero;
		
//		if(valor > 0) {
//			numero = valor;
//		}else {
//			numero = 7;
//		}
		
		//Operador Tern�rio
		numero = (valor > 0) ? valor : 7;
		
		System.out.println(numero);
	}
}
