package lista1;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int pesoDois=2, pesoTres=3, pesoCinco=5;
		String nome;
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite o nome do aluno: ");
		nome = scan.next();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		
		media = ((nota1*pesoDois) + (nota2*pesoTres) + (nota3*pesoCinco))/10;
		
		System.out.println("A média do aluno "+nome+" foi: "+media);
		

	}

}
