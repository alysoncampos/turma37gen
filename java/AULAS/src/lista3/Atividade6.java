package lista3;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).
*/
public class Atividade6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero=0, cont=0;
		double soma=0.00;
		
		System.out.println("Para sair do programa digite 0");
		do {
			System.out.printf("Digite um n�mero: ");
			numero = scan.nextInt();
			if (numero%3==0 && numero>0) {
				soma+=numero;
				cont++;
			}
			
		} while(numero!=0);
		
		System.out.printf("\nA m�dia entre eles � %.2f.",(soma/cont));
	}

}
