package lista1;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int anos, meses, dias;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
		System.out.println("Digite sua idade em dias: ");
		dias = scan.nextInt();
		
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println(nome+", você tem "+anos+" anos "+meses+" meses e "+dias+" dias.");

	}

}
