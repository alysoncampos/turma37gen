package app;

import java.util.Scanner;

import entities.Pessoa;

public class CadAmigo {

	public static void main(String[] args) {
		
		//variaveis
		Scanner scan = new Scanner(System.in);
		Pessoa cad1 = new Pessoa();
		
		System.out.println("CADASTRO DE AMIGOS");
		System.out.println("Digite o nome do amigo: ");
		cad1.nome = scan.next();
		System.out.println("Digite o ano de nascimento: ");
		cad1.anoNascimento = scan.nextInt();
		System.out.println("Digite 1-masculino, 2-feminina, 3-neutre: ");
		char op = scan.next().charAt(0);
		if(op == '1') {
			cad1.pronome = 'o';
		} else if (op == '2') {
			cad1.pronome = 'a';
		} else if (op == '3') {
			cad1.pronome = 'e';
		}
		System.out.printf("Bom dia Sr%c. %s, sua idade aproximadamente é %d anos.",cad1.pronome,cad1.nome.toUpperCase(),cad1.calculaIdade(2021));
		
	}

}
