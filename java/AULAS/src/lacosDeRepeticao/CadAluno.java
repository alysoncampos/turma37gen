package lacosDeRepeticao;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome[] = new String[4]; 
		int nota[] = {0,0,0,0,};
		char disciplinaNota[] = new char[4];
		String disciplina[] = {"1-MATEMÁTICA","2-PORTUGUÊS","3-CIÊNCIAS","4-ARTES","5-GEOGRAFIA","6-BIOLOGIA"};
		
		
		for(int x=0; x<4; x++) {
			System.out.printf("Digite o nome do aluno: ");
			nome[x] = scan.next();
			
			for(int i=0; i<disciplina.length; i++) {
				System.out.print(disciplina[i]+"  ");
			}
			System.out.println();
			System.out.printf("Digite o código da disciplina: ");
			disciplinaNota[x] = scan.next().charAt(0);
			System.out.printf("Digite a nota: ");
			nota[x] = scan.nextInt();
			System.out.println("---------------------------------------------");
		}
		
		for(int y=0; y<4; y++) {
			
			if (disciplinaNota[y] == '1'){
				System.out.printf("\n%s - NOTA MATEMÁTICA: %d", nome[y], nota[y]);
			} 
			else if (disciplinaNota[y] == '2'){
				System.out.printf("\n%s - NOTA PORTUGUÊS: %d", nome[y], nota[y]);
			}
			else if (disciplinaNota[y] == '3'){
				System.out.printf("\n%s - NOTA CIÊNCIA: %d", nome[y], nota[y]);
			}
			else if (disciplinaNota[y] == '4'){
				System.out.printf("\n%s - NOTA ARTES: %d", nome[y], nota[y]);
			}
			else if (disciplinaNota[y] == '5'){
				System.out.printf("\n%s - NOTA GEOGRAFIA: %d", nome[y], nota[y]);
			}
			else if (disciplinaNota[y] == '6'){
				System.out.printf("\n%s - NOTA BIOLOGIA: %d", nome[y], nota[y]);
			}
		
		}
		
		
	}

}
