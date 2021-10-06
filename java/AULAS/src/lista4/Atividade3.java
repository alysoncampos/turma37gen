package lista4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Atividade3 {
/*
Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		
		
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				n1[linha][coluna] = gerador.nextInt(10)+1;
				n2[linha][coluna] = gerador.nextInt(10)+1;
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
		}
		
		System.out.printf("\nN1\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t%d", n1[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.printf("\nN2\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t%d", n2[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.printf("\nM1\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t%d", m1[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.printf("\nM2\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				System.out.printf("\t%d", m2[linha][coluna]);
			}
			System.out.println();
		}
		
	}

}
