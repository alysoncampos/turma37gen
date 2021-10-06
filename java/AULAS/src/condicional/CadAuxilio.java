package condicional;

import java.util.Locale;
import java.util.Scanner;

public class CadAuxilio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		char pronome;
		boolean chefaFamilia=false;
		boolean naoOutroAuxilio=true;
		final double AUXILIO=600.00;
		final double PORFILHO=50.00;
		int filhos=0;
		char op;
		
		
		System.out.print("Digite o nome da pessoa: ");
		nome = scan.nextLine();
		System.out.print("Digite o pronome de tratamento A/O/E: ");
		pronome = scan.next().toLowerCase().charAt(0);
		scan.nextLine();
		System.out.print("Chefa de familia S/N: ");
		op = scan.next().toUpperCase().charAt(0);
		if (op =='S') {
			chefaFamilia = true;
		}
		System.out.print("Já recebeu outro auxilio? S/N:  ");
		op = scan.next().toUpperCase().charAt(0);
		if(op == 'S') {
			naoOutroAuxilio = false;
		}
		System.out.print("Quantidade de filhos: ");
		filhos = scan.nextInt();
		
		
		if(chefaFamilia && naoOutroAuxilio) {
			System.out.printf("Olá Sr%c vai receber de auxilio %.2f, mais R$ %.2f do(s) filhos(S) gerando um total de R$ %.2f.",pronome,(AUXILIO*2),(PORFILHO*filhos), (AUXILIO*2+(PORFILHO*filhos)));
		}
		else if (naoOutroAuxilio) {
			System.out.printf("Olá Sr%c vai receber de auxilio %.2f, mais R$ %.2f do(s) filhos(S) gerando um total de R$ %.2f.",pronome,(AUXILIO*2),(PORFILHO*filhos),(AUXILIO+(PORFILHO*filhos)));
		}
		else {
			System.out.println("Você não tem direito ao benefício!!");
		}
	
	}
	

}
