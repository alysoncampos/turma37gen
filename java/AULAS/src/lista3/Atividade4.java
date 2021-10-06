package lista3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade;
		char sexo; //(1-feminino / 2-masculino / 3-Outros)
		char opcao; //(1, pessoa calma; 2, pessoa nervosa; e 3, pessoa agressiva)
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosasAcimaQuarenta=0, calmasMenorDezoito=0;
		char op='S'; 
		int contadorHabitantes=1;
		
		while(op == 'S' && contadorHabitantes<=150){
			System.out.printf("Habitante numero: %d",contadorHabitantes);
			System.out.printf("\nDigite a idade: ");
			idade = scan.nextInt();
			System.out.printf("\nEscolha\n1-Feminino\n2-Masculino\n3-Outros: ");
			sexo = scan.next().charAt(0);
			System.out.printf("\nEscolha\n1-Calmo(a)\n2-Nervoso(a)\n3-Agressivo: ");
			opcao = scan.next().charAt(0);
			System.out.printf("\nContinua S/N: ");
			op = scan.next().toUpperCase().charAt(0);
			contadorHabitantes++;
			if (opcao=='1'){
				pessoasCalmas++;
			} 
			if (sexo=='1' && opcao=='2') {
				mulheresNervosas++;
			}
			if (sexo=='2' && opcao=='3') {
				homensAgressivos++;
			}
			if (sexo=='3' && opcao=='1') {
				outrosCalmos++;
			}
			if (idade>=40 && opcao=='2') {
				nervosasAcimaQuarenta++;
			}
			if (idade<18 && opcao=='1') {
				calmasMenorDezoito++;
			}
			
		} 
		System.out.printf("\nHabitantes entrevistados:    %d",(contadorHabitantes-1));
		System.out.printf("\nPessoas calmas:              %d",pessoasCalmas);
		System.out.printf("\nMulheres nervosas:           %d",mulheresNervosas);
		System.out.printf("\nHomens agressivos:           %d",homensAgressivos);
		System.out.printf("\noutros calmos:               %d",outrosCalmos);
		System.out.printf("\nNervosos maiores de 40 anos: %d",nervosasAcimaQuarenta);
		System.out.printf("\nCalmos menores de 18 anos:   %d",calmasMenorDezoito);
	}
}
