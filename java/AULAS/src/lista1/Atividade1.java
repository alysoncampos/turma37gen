package lista1;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int anos, meses, dias, totalDias;
		
		System.out.println("Digite o seu nome: ");
		nome = scan.next();
		
		System.out.println("Digite sua idade: ");
		anos = scan.nextInt();
		
		System.out.println("Digite quantos meses: ");
		meses = scan.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = scan.nextInt();
		
		totalDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("Oi "+nome+", a sua idade expressa em dias aproximadamente é: "+totalDias+" dias.");
		

	}

}
