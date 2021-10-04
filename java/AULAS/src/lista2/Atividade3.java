package lista2;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade;

		System.out.printf("Digite sua idade: ");
		idade = scan.nextInt();
		
		if (idade >=18 && idade <= 25) {
			System.out.printf("Sua categoria é adulto");
		} 
		else if (idade >=15 && idade <= 17) {
			System.out.printf("Sua categoria é Juvenil");
		} 
		else if (idade >=10 && idade <=14) {
			System.out.printf("Sua categoria é Infantil");
		}
		else {
			System.out.printf("Não trabalhamos com essa idade!");
		}
	}

}
