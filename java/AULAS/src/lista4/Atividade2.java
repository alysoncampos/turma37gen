package lista4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Atividade2 {
/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor 
 * com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos 
 * lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int[] jogadas = new int [10];
		double media=0.00;
		int valorTotal=0, maiorValor=0, cont=0;
		
		for(int i=0; i<10; i++) {
			jogadas[i] = gerador.nextInt(6) + 1;
			System.out.printf("\nLa�amento %d = %d",(i+1),jogadas[i]);
			valorTotal = valorTotal + jogadas[i];
			if(jogadas[i]>=maiorValor) {
				if(jogadas[i]==maiorValor) {
					cont++;
				} else if (jogadas[i]>maiorValor) {
					cont=1;
				}
				maiorValor = jogadas[i];
			}
		}
		media = valorTotal/10.00;
		System.out.println();
		System.out.printf("\nM�dia: %.2f",media);
		System.out.printf("\nMaior valor: %d",maiorValor);
		System.out.printf("\nO maior valor apareceu %d x.",cont);

	}

}
