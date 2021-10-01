package lista1;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = scan.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = scan.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = scan.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = scan.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = scan.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = scan.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("O valor de X é %.2f e o valor de y é %.2f",x,y);
		
	}

}
