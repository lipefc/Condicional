package br.com.iblue.Essencial;

public class Inteiros {

	public static void main(String[] args) {
		
		//Tipos Primários
		long num1 = 5555;
		int num2 = 555;
		short num3 = 55;
		byte num4 = 5;
		char num9 = 5;
		
		//Tipos Não Primários
		Long num5 = (long) 9999;
		Integer num6 = 999;
		Short num7 = 99;
		Byte num8 = 9;
		Character num10 = 9;
		
		System.out.println("long -> Num1 = " + num1);
		System.out.println("int -> Num2 = " + num2);
		System.out.println("short -> Num3 = " + num3);
		System.out.println("byte -> Num4 = " + num4);
		System.out.println("char -> Num9 = " + num9);
		System.out.println("\n");
		System.out.println("Long -> Num5 = " + num5);
		System.out.println("Integer -> Num6 = " + num6);
		System.out.println("Short -> Num7 = " + num7);
		System.out.println("Byte -> Num8 = " + num8);
		System.out.println("Character -> Num10 = " + num10);
		System.out.println("\n");
		System.out.println("long/Long ->" + Long.SIZE + " bits");
		System.out.println("int/Integer ->" + Integer.SIZE + " bits");
		System.out.println("short/Short ->" + Short.SIZE + " bits");
		System.out.println("byte/Byte ->" + Byte.SIZE + " bits");
		System.out.println("char/Character ->" + Character.SIZE + " bits");
		System.out.println("\n");
		System.out.println("Valor Min long/Long " + Long.MIN_VALUE);
		System.out.println("Valor Max long/Long " + Long.MAX_VALUE);
		System.out.println("\n");
		System.out.println("Valor Min int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/Integer " + Integer.MAX_VALUE);
		System.out.println("\n");
		System.out.println("Valor Min short/Shor " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Shor " + Short.MAX_VALUE);
		System.out.println("\n");
		System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte " + Byte.MAX_VALUE);
		System.out.println("\n");
		System.out.println("Valor Min char/Character " + Character.MIN_VALUE);
		System.out.println("Valor Max char/Character " + Character.MAX_VALUE);
	}
}