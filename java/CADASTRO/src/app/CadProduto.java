package app;

import java.util.Scanner;
import entities.Pessoa;
import entities.Produto;

public class CadProduto {

	public static void main(String[] args) {
		
		Pessoa c1 = new Pessoa();
		Produto p1 = new Produto();
		Scanner scan = new Scanner(System.in);
		
		p1.codigo = "X01";
		p1.estoque= 10;
		p1.nome = "Celular";
		p1.valor=2500.00;
		
		System.out.println("Digite seu nome: ");
		c1.nome = scan.next();
		System.out.println("Digite 1-masculino, 2-feminina, 3-neutre: ");
		char op = scan.next().charAt(0);
		if(op == '1') {
			c1.pronome = 'o';
		} else if (op == '2') {
			c1.pronome = 'a';
		} else if (op == '3') {
			c1.pronome = 'e';
		}
		
		System.out.println("Você deseja: 1-colocar no estoque ou 2-tirar do estoque: ");
		char op2 = scan.next().charAt(0);
		if (op2 == '1') {
			System.out.print("Digite a quantidade que você deseja colocar: ");
            int quantidade = scan.nextInt();
            p1.colocarEstoque(quantidade);
		} else if(op2 == '2') {
			System.out.print("Digite a quantidade que você deseja tirar: ");
            int quantidade = scan.nextInt();
            p1.tirarEstoque(quantidade);
		}
		
		System.out.println(p1.toString());
	    System.out.println(c1.toString());
	}

}
