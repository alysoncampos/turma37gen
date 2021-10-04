package lista2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1;
        int n2;
        int n3;
        int aux;
        
        System.out.printf("Entre com o primeiro número: ");
		n1 = scan.nextInt();
		System.out.printf("Entre com o segundo número: ");
		n2 = scan.nextInt();
		System.out.printf("Entre com o terceiro número: ");
		n3 = scan.nextInt();
		System.out.printf("Você digitou: %d, %d e %d.",n1,n2,n3);
		
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n1 > n2) {
        	aux = n1;
            n1 = n2;
            n2 = aux;
        }
        
        System.out.printf("\nA ordem crescente dos números digitados é: %d, %d e %d.",n1,n2,n3);
	}
}
