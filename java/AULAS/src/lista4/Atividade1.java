package lista4;

import java.util.Locale;
import java.util.Scanner;


public class Atividade1 {
/*	Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de 
 	uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] pontos = new int[5];
		int maiorPontuacao=0;
		
		for(int i=0; i<5; i++) {
			System.out.print("Entre com a pontua��o: ");
			pontos[i] = scan.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.printf("\nPontua��o %d = %d",(i+1),pontos[i]);
			if (pontos[i]>maiorPontuacao) {
				maiorPontuacao = pontos[i];
			}
		}
		
		System.out.printf("\nA maior pontua��o foi: %d",maiorPontuacao);
	}

}
