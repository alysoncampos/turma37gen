package app;

import java.util.Scanner;

import entities.Cliente;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String cpf;
		String pagamento;
		int idade;
		
		System.out.println("Digite o nome do cliente: ");
		nome = scan.next();
		
		System.out.println("Digite o cpf do cliente: ");
		cpf = scan.next();
		
		System.out.println("Digite a idade do cliente: ");
		idade = scan.nextInt();
		
		System.out.println("Digite o pagamento será: 1-a vista 2- cartão 3-parcelado");
		pagamento = scan.next();
		
		if(pagamento.equals("1")) {
			pagamento = "a vista";
		}else if(pagamento.equals("2")) {
			pagamento = "cartão";
		}else {
			pagamento = "parcelado";
		}
		
		Cliente cliente1 = new Cliente(nome,cpf,idade,pagamento);
		System.out.println(cliente1.toString());

	}

}
