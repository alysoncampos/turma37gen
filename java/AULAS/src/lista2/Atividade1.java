package lista2;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int maiorNumero=0;
		
		System.out.printf("Entre com o primeiro n�mero: ");
		num1 = scan.nextInt();
		System.out.printf("Entre com o segundo n�mero: ");
		num2 = scan.nextInt();
		System.out.printf("Entre com o terceiro n�mero: ");
		num3 = scan.nextInt();
		if (num1>num2 && num1>num3) {
			maiorNumero = num1;
		}
		else if (num2>num1 && num2>num3) {
			maiorNumero = num2;
		}
		else {
			maiorNumero = num3;
		}
		System.out.printf("\nO primeiro foi %d, o segundo foi %d e o terceiro foi %d. O maior n�mero digitado foi: %d.",num1,num2,num3,maiorNumero);
	}
		
}
