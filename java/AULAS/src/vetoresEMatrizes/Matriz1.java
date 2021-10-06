package vetoresEMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		System.out.println("MATRIZ 3X3");
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = scan.nextInt();
			}
		}
		
		System.out.println("A MATRIZ FICOU: ");
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		
	}
}
