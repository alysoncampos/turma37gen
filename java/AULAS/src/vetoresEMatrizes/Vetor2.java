package vetoresEMatrizes;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorAula = new int[11];
		int numero=0;
		
		System.out.print("Informe um número: ");
		numero = scan.nextInt();
		
		System.out.printf("A tabuada do %d é: ",numero);
		
		for(int i=0; i<11; i++) {
			vetorAula[i] = numero*i;
			System.out.printf("\n%d x %d = %d",numero,i,vetorAula[i]);
		}

	}

}
