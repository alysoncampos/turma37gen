package condicional;

import java.util.Scanner;

public class ExemploSe {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int ANO_ATUAL=2021;
		String nome;
		int anoNascimento;
		int idade;
		char pronome;
		
		System.out.print("Digite o nome: ");
		nome = scan.next();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = scan.nextInt();
		System.out.print("Qual o pronome A/O/E: ");
		pronome = scan.next().toUpperCase().charAt(0);
		idade = ANO_ATUAL - anoNascimento;
		
		if (idade>=40) {
			System.out.println("Você é cringe!!");
		} 
		else if(idade>=18 && pronome == 'A') {
			System.out.println("Você é adulta!!");
		}
		else if(idade>=18 && pronome == 'O') {
			System.out.println("Você é adulto!!");	
		}
		else if(idade>=18 && pronome == 'E') {
			System.out.println("Você é adulte!!");
		}
		else {
			System.out.println("Você é jovem!!");
		}
		
	}
}
