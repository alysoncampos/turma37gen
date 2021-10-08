package app;

import java.util.Scanner;

import entities.ProdutoEletronico;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String modelo, marca; 
		int op;
		double preco;
		boolean ligado;
		
		
		System.out.println("Digite o modelo: ");
		modelo = scan.next();
		System.out.println("Digite a marca: ");
		marca = scan.next();
		System.out.println("Digite o pre�o: ");
		preco = scan.nextDouble();
		System.out.println("Est� ligado: 1-sim 2-n�o ");
		op = scan.nextInt();
		
		if (op == 1) {
			ligado = true;
		} else {
			ligado = false;
		}
		
		ProdutoEletronico elet = new ProdutoEletronico(modelo,marca,preco,ligado);
		System.out.println(elet.toString());

	}

}
