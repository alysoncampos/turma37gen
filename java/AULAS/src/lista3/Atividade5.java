package lista3;

import java.util.Scanner;

/*
  Crie um programa que leia um número do teclado até que encontre um
  número igual a zero. No final, mostre a soma dos números
  digitados.
 */
public class Atividade5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero=0, soma=0;
		
		do {
			System.out.printf("Digite um número: ");
			numero = scan.nextInt();
			soma = soma + numero;
			
		} while(numero!=0);
		
		System.out.printf("A soma dos números digitados foi: %d",soma);
	}
}
