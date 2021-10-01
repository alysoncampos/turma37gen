package lista1;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int horas, minutos, segundos, tempoTotal;
		
		System.out.println("Digite o tempo do evento em segundo: ");
		tempoTotal = scan.nextInt();
		
		horas = tempoTotal/3600;
		minutos = (tempoTotal - (horas*3600))/60;
		segundos = (tempoTotal%60);
		
		System.out.println("O tempo do evento é de "+horas+" horas "+minutos+" minutos e "+segundos+ " segundos.");
	}

}
