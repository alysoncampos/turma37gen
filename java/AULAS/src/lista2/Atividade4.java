package lista2;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.printf("Digite um valor inteiro positivo: ");
		numero = scan.nextDouble();
		
		if (numero<0) {
			System.out.printf("\nImposs�vel...n�mero negativo.");
		}
		else if (numero==0) {
			System.out.printf("\nO zero � um n�mero nulo.");
		} 
		else if (numero%2==0) {
			System.out.printf("\nO valor � par e sua raiz � %.2f",Math.sqrt(numero));
		}
		else {
			System.out.printf("\nO valor � impar e seu valor ao quadrado � %.2f.",Math.pow(numero,2));
		}	
	}
}
