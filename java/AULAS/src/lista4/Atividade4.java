package lista4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Atividade4 {
/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int[][] matriz = new int[3][3];
		int somaTotal=0, somaDiagonal=0;
		
		System.out.println("MATRIZ 3X3: ");
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				matriz[linha][coluna] = gerador.nextInt(10);
				System.out.printf("\t %d \t",matriz[linha][coluna]);
				somaTotal = somaTotal + matriz[linha][coluna];
			}
			System.out.println();
		}
		
		for(int d=0; d<3; d++) {
			somaDiagonal = somaDiagonal + matriz[d][d];
		}
		
		System.out.printf("\nA soma total da matriz é: %d",somaTotal);
		System.out.printf("\nA soma da diagonal principal é: %d",somaDiagonal);
		
	}

}
