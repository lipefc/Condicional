package br.com.iblue.Essencial;

public class Reais {

	public static void main(String[] args) {
		
		//Tipos Primários
		float preco1 = 23.4f; //23.40
		double preco2 = 23.4; //23.454984654186465486465484658454
		
		//Tipos Não Primários
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> Num1 = " + preco1);
		System.out.println("double -> Num2 = " + preco2);
		System.out.println("Float -> Num3 = " + preco3);
		System.out.println("Double -> Num4 = " + preco4);
		System.out.println("\n");
		System.out.println("float/Float ->" + Float.SIZE + " bits");
		System.out.println("double/Double ->" + Double.SIZE + " bits");
		System.out.println("\n");
		System.out.println("Valor Min float/Float " + Float.MIN_VALUE);
		System.out.println("Valor Max float/Float " + Float.MAX_VALUE);
		System.out.println("\n");
		System.out.println("Valor Min double/Double " + Double.MIN_VALUE);
		System.out.println("Valor Max double/Double " + Double.MAX_VALUE);
	}
}