package lista2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1;
        int n2;
        int n3;
        int aux;
        
        System.out.printf("Entre com o primeiro n�mero: ");
		n1 = scan.nextInt();
		System.out.printf("Entre com o segundo n�mero: ");
		n2 = scan.nextInt();
		System.out.printf("Entre com o terceiro n�mero: ");
		n3 = scan.nextInt();
		System.out.printf("Voc� digitou: %d, %d e %d.",n1,n2,n3);
		
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
        
        System.out.printf("\nA ordem crescente dos n�meros digitados �: %d, %d e %d.",n1,n2,n3);
	}
}
