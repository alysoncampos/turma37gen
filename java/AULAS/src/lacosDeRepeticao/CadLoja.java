package lacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String codigoProduto[] = {"X01", "X02", "X03"};
		String nomeProduto[] = {"CALÇA", "CAMISA", "SAIA"};
		int estoque[] = {20,20,20};
		double valorProduto[] = {100.50, 50.75, 70.99};
		String auxCodigo;
		int teste = 0;
		int auxQtde=0;
		
		System.out.printf("LOJA DA TURMA 37\n");
		System.out.printf("\nCOD\tPRODUTO\tESTOQUE\tVALOR\n");
		for(int x=0; x<nomeProduto.length; x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
		}
		System.out.printf("\n");
		System.out.printf("\nDIGITE O CÓDIGO DO PRODUTO: ");
		auxCodigo = scan.next().toUpperCase();
		
		System.out.printf("\nPRODUTO ESCOLHIDO");
		System.out.printf("\nCOD\tPRODUTO\tESTOQUE\tVALOR\n");
		for(int y=0; y<nomeProduto.length; y++) {
			if (codigoProduto[y].equals(auxCodigo)) {
				System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[y],nomeProduto[y],estoque[y],valorProduto[y]);
				teste = y;
				break;
			} else {
				teste++;
			}
		}
		if (teste==nomeProduto.length){
			System.out.printf("\nProduto não encontrado.");
		} else if(estoque[teste]  == 0) {
			System.out.printf("\nImpossível realizar, estoque vázio!!");
		} else {
			System.out.printf("\nQuantos você deseja comprar: ");
			auxQtde= scan.nextInt();
			if(auxQtde<0) {
				System.out.printf("Quantidade informada - numero negativo!!");
			}
			else if(estoque[teste] == 0) {
				System.out.printf("\nProduto indisponível...");
			}
			else if(auxQtde > estoque[teste]) {
				System.out.printf("\nQuantidade indisponível");
			}
			else {
				System.out.printf("\nTotal a pagar %.2f",(auxQtde*valorProduto[teste]));
				estoque[teste] -= auxQtde;
			}
		}
		
		System.out.printf("\nPOS VENDA\n");
		System.out.printf("\nCOD\tPRODUTO\tESTOQUE\tVALOR\n");
		for(int x=0; x<nomeProduto.length; x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
		}
		
	}

}
