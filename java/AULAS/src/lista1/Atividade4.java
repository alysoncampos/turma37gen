package lista1;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = scan.nextInt();
		System.out.println("Digite o valor de B: ");
		b = scan.nextInt();
		System.out.println("Digite o valor de C: ");
		c = scan.nextInt();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		d = (r+s)/2;
		
		System.out.println("O valor de D é: "+d);
		
	}

}
