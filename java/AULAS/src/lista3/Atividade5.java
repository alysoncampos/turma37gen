package lista3;

import java.util.Scanner;

/*
  Crie um programa que leia um n�mero do teclado at� que encontre um
  n�mero igual a zero. No final, mostre a soma dos n�meros
  digitados.
 */
public class Atividade5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero=0, soma=0;
		
		do {
			System.out.printf("Digite um n�mero: ");
			numero = scan.nextInt();
			soma = soma + numero;
			
		} while(numero!=0);
		
		System.out.printf("A soma dos n�meros digitados foi: %d",soma);
	}
}
