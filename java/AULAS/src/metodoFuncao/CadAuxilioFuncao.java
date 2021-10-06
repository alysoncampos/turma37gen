package metodoFuncao;

import java.util.Locale;
import java.util.Scanner;

public class CadAuxilioFuncao {

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
		
		System.out.printf("O valor de auxilio é R$ %.2f",(calcAuxilio(chefaFamilia,naoOutroAuxilio)+((naoOutroAuxilio)?(filhos*50):0)));
		
	 }	
		
	public static double calcAuxilio(boolean chefaFamilia,boolean naoOutroAuxilio) {
			double auxilio=0.00;
			
			if(chefaFamilia && naoOutroAuxilio) {
				auxilio = 1200.00;
			} else if(naoOutroAuxilio) {
				auxilio = 600.00;
			} 
			
			return auxilio;

	}

}
