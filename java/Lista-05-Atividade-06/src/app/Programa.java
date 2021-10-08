package app;

import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, opConta, opMovimentacao;
		String cpf;
		boolean ativo;
		double saque, deposito;
		
		Conta conta1 = new Conta();
		
		System.out.println("Digite o número da conta: ");
		numero = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Digite o seu cpf: ");
		cpf = scan.nextLine();
		
		System.out.println("A conta: 1-ativada 2-desativada ");
		opConta = scan.nextInt();		
		
		if(opConta== 1) {
			ativo = true;
		} else {
			ativo = false;
		}
		
		System.out.println("Você tem: "+conta1.getSaldo());
		System.out.println("Você pretende: 1-sacar 2-depositar");
		opMovimentacao = scan.nextInt();
		if(opMovimentacao == 1) {
			System.out.println("Quanto você deseja sacar: ");
			saque = scan.nextDouble();
			conta1.sacar(saque);
			System.out.println("Novo saldo: "+conta1.getSaldo());
		} else {
			System.out.println("Quanto você deseja deposito: ");
			deposito = scan.nextDouble();
			System.out.println("Novo saldo: "+conta1.deposito(deposito));
		}
		
		scan.close();
	}

}
