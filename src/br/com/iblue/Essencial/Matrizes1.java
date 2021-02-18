package br.com.iblue.Essencial;
/*
Vetores / arrays / matrizes multi-dimenssionais

Vetor
int numeros[3];
numeros[0] = 3;
numeros[1] = 2;
numeros[2] = 5;

Matriz
[linhas][colunas]
int numeros[3][3]

int numeros[0][0] = 1;
int numeros[0][1] = 2;
int numeros[0][2] = 5;
int numeros[1][0] = 7;
int numeros[1][1] = 4;
int numeros[1][2] = 9;
int numeros[2][0] = 3;
int numeros[2][1] = 6;
int numeros[2][2] = 32;
*/
public class Matrizes1 {
	
	public static void main(String[] args) {

		//Declaração
		int outros_numeros [][];
		
		//Declaração e Definição de Tamanho
		int numero[][] = new int [3][3];
		
		//Declaração, Definição e Inicialização
		int mais_numeros[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8 ,9}};
		
		//Declaração de uma matriz e informando somente as linhas
		int matriz[][] = new int [2][];
		matriz[0] = new int[5];
		matriz[1] = new int[3];
		
		int nova_matriz[][] = {{1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11}};
	}
}