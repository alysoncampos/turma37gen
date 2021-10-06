package vetoresEMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		double[] nota = new double[5];
		
		//tamanho do array
		if(arrayDois.length>8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");	
		} else {
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.printf("Tamanho do ArrayUm = %d",arrayUm.length);
		System.out.println();
		
		//utilização do for-each
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
		for(String i : cars) {
			System.out.println(i);
		}
		System.out.println();
		
		//populando um array
		for(int i=0; i<5; i++) {
			System.out.println("Entre com uma nota");
			nota[i] = scan.nextDouble();
		}
		System.out.println();
		
		//apresentando um array
		for(int i=0; i<5; i++) {
			System.out.printf("\nNota %d = %.2f",(i+1),nota[i]);
		}
		
	}

}
