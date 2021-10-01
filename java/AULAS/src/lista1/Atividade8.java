package lista1;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int taxaDistribuidor=28, taxaImpostos=45;
		double valorConsumidor, valorDeFabrica, valorDistribuidor, valorImpostos;
		
		System.out.println("Digite o custo de fábrica do automóvel: ");
		valorDeFabrica = scan.nextDouble();
		
		valorDistribuidor = (valorDeFabrica*taxaDistribuidor)/100; 
		valorImpostos = (valorDeFabrica*taxaImpostos)/100;
		
		valorConsumidor = (valorDeFabrica + valorDistribuidor + valorImpostos);
		
		System.out.printf("O custo ao consumidor é de R$ %.2f", valorConsumidor);
		
	}

}
