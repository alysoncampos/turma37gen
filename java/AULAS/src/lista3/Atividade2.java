package lista3;
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero=0, totPar=0, totImpar=0;
		
		for (int x=1; x<=10; x++) {
			System.out.printf("Digite o %d n�mero: ",x);
			numero = scan.nextInt();
			
			if(numero>0 && numero%2==0) {
				totPar++;
			}
			else if(numero>0 && numero%2==1) {
				totImpar++;
			}
			
		}
		
		System.out.printf("\nVoc� digitou %d n�meros pares e %d n�meros impares.",totPar,totImpar);
		
	}
}
