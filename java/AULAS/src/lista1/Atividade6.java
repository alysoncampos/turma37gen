package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double d;
		double x2, x1, y1, y2;
		
		System.out.println("Digite o valor de x1: ");
		x1 = scan.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = scan.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = scan.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = scan.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		System.out.printf("O valor de d é %.2f",d);
	}

}
