package application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

/* 
 * PROJETO E-COMMERCE - LOJA DE ROUPAS PROGRAMADO POR: ÁLYSON CAMPOS, 
 * BRUNA GUIMARÃES, MATHEUS AMÂNCIO, RENAN UCHOA E SYLVIA MONTEIRO.
 */

public class Programa {
	
	static int notaFiscalEletronica= 0;
	static List<Produto> lista = new ArrayList<>();
	static double valorTotal = 0.00;
	static double valorFinal = 0.00;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		final double IMPOSTO = 0.09;
		String codProduto = " ";
		char desejaComprar = ' ';
		char desejaContinuar = ' ';
		char voltarSite = ' ';
		char op=' ';
		int pos =-1, auxQtde=0;
		boolean carrinhoProduto = false;
		boolean continuaNoTry = true;
		
	    lista.add(new Produto("G5-1","CROPPED CHAVE",112.00,10));
	    lista.add(new Produto("G5-2","VESTIDO VERBO",160.00,10)); 
	    lista.add(new Produto("G5-3","VESTIDO FLORAL",150.00,10));
	    lista.add(new Produto("G5-4","CAMISA REFORMA",120.00,10));
	    lista.add(new Produto("G5-5","BERMUDA ALFAIA",180.00,10));
	    lista.add(new Produto("G5-6","MACACÃO CAMINHO",200.00,10));
	    lista.add(new Produto("G5-7","MACACÃO VARANDA",190.00,10));
	    lista.add(new Produto("G5-8","MACACÃO BRISA",210.00,10));
	    lista.add(new Produto("G5-9","CALÇA FLOW",119.00,10));
	    lista.add(new Produto("G5-10","SAIA VÉRTICA",110.00,10));
	    
	    //INÍCIO LOOP PROGRAMA
	    do {
	    	insereSlogan();
	    	System.out.println();
			System.out.println("\t\t>>> SEJA BEM VINDE À AVOÁ G5 <<<");
			System.out.println("\n\n\n\n\n\n");
			System.out.print("► Deseja fazer uma compra [S/N] ? :");
			desejaComprar = sc.next().toUpperCase().charAt(0);
			//VALIDA ENTRADA
			while (true) {
				if(desejaComprar == 'S' || desejaComprar == 'N') {
					break;
				}
				else {
					System.out.print("\nOpção inválida, tente novamente...\n");
					System.out.print("\n► Deseja fazer uma compra [S/N] ? : ");
					desejaComprar = sc.next().toUpperCase().charAt(0);
				}	
			}
			if (desejaComprar == 'N') {
				limpaTela();
				insereSlogan();
				System.out.println("\nPoxa, que pena!! Mas te vejo em breve, tá?\n");
				break;
			}
			//APRESENTAÇÃO PRODUTOS
			do {//INICIO LOOP COMPRA
				limpaTela();
				insereSlogan();
				menuProdutos();
				linha();
				//ESCOLHE PRODUTO
				System.out.print("\n► Digite o código do produto: ");
				codProduto = sc.next().toUpperCase();
				for(int cont = 0; cont < lista.size(); cont++) {
					if (lista.get(cont).getCodProduto().equals(codProduto)) {
						pos = cont;
						break;
					}	
				}
				if (pos >= 0){
					//DADOS PRODUTO ESCOLHIDO
					linha();
					System.out.println("\nPRODUTO ESCOLHIDO: ");
		            System.out.print("COD\t\tPRODUTO\t\t\tVALOR\t\tESTOQUE\n");
		            System.out.println(lista.get(pos).getCodProduto()+"\t\t"+lista.get(pos).getProduto()+"\t\t"+lista.get(pos).getPreco()+"\t\t"+lista.get(pos).getEstoque()+((lista.get(pos).getEstoque()>0)?" ":"-INDISPONÍVEL"));
		            linha();
		            continuaNoTry = true;
		            do {//VALIDA A QUANTIDADE DESEJADA E 
		            	//TRATA O ERRO CASO O USUÁRIO DIGITE LETRA AO INVÉS DE NÚMERO
		            	try {
		            		System.out.print("\n► Digite a quantidade desejada : ");
		            		auxQtde = sc.nextInt();
		            		continuaNoTry = false; 
		            	}
		            	catch (InputMismatchException exception) {
		            		System.out.println("\nOps, digite um número...");
		            		sc.nextLine();
		            	}
		            } while(continuaNoTry);
		            if (auxQtde<0) {
		            	System.out.println("\nImpossivel realizar, valor negativo!!!");
		            }
		            else if (auxQtde==0) {
		                System.out.println("\nImpossivel realizar, nenhuma quantidade informada!!");
		            }
		            else if (lista.get(pos).getEstoque()==0){
		                System.out.println("\nImpossivel realizar, produto indisponível!!!");
		            }
		            else if (lista.get(pos).getEstoque()<auxQtde) {
		                System.out.println("\nImpossivel realizar, quantidade maior que estoque!!");
		            } 
		            else {
		            	//ATUALIZA E EXIBE CARRINHO
		            	lista.get(pos).retiraEstoque(auxQtde);
		                lista.get(pos).adicionaCarrinho(auxQtde);
		                limpaTela();
		                tituloCarrinho();
		                for(Produto escolhido : lista) {
		                	if(escolhido.getCarrinho() != 0) {
		                		System.out.println(escolhido.getCodProduto()+"\t"+escolhido.getProduto()+"\t  R$"+escolhido.getPreco()+"\t"+escolhido.getCarrinho()+"\t\tR$"+escolhido.getPreco()*escolhido.getCarrinho());
		                		carrinhoProduto = true;
		                	}	
		                }
		                linha();
		           }    
		        } else {
		            System.out.println("\nCodigo informado não existe!!!");
		        }
				//PERGUNTA SE DESEJA PROSSEGUIR COM A COMPRA
				System.out.print("\n► Deseja continuar a sua compra [S/N] ? : ");
				desejaContinuar = sc.next().toUpperCase().charAt(0);
				while (true) {
					if (desejaContinuar == 'S' || desejaContinuar == 'N') {
						break;
					} 
					else {
						System.out.print("\nOpção inválida, tente novamente...\n");
						System.out.print("\n► Deseja continuar a sua compra [S/N] ? : ");
						desejaContinuar = sc.next().toUpperCase().charAt(0);
					}
				}
				
			} while(desejaContinuar == 'S');
			//EXIBE CARRINHO CASO EXISTA PRODUTO E CALCULA O VALOR DA COMPRA 
			if (carrinhoProduto) {
				limpaTela();
				tituloCarrinho();
				for(Produto escolhido : lista) {
					if(escolhido.getCarrinho() != 0) {
						System.out.println(escolhido.getCodProduto()+"\t"+escolhido.getProduto()+"\t  R$"+escolhido.getPreco()+"\t"+escolhido.getCarrinho()+"\t\tR$"+escolhido.getPreco()*escolhido.getCarrinho());
						valorTotal += escolhido.getPreco()*escolhido.getCarrinho();
					}	
				}
				linha();
				System.out.println("\nTOTAL PARCIAL:                                          R$"+valorTotal);
				linha();
			}
			//OPÇÕES DE PAGAMENTO
			if(valorTotal > 0) {
				opcoesPagamento();
				System.out.print("\n► Digite a opção desejada: ");
				op = sc.next().charAt(0);
				while(true) {
					if(op == '1' || op == '2' || op == '3') {
						break;
					}
					else {
						System.out.print("\n► Opção inválida, digite a opção desejada: ");
						op = sc.next().charAt(0);
					}
				}
				//OPÇÃO 1 - À VISTA
				if(op == '1') {
					notaFiscal();
					System.out.print("\n(+)SUBTOTAL:                                            R$"+ df.format(valorTotal));
					System.out.print("\n(-)DESCONTO (10%):                                      R$ "+ df.format(valorTotal*0.10));
					valorFinal = valorTotal - valorTotal*0.10;
					System.out.print("\n(=)TOTAL A PAGAR:                                       R$"+ df.format(valorFinal)+"\n");
					linha();
					System.out.print("\nVal. Aprox. dos Tributos (9%):                          R$"+ df.format(valorTotal*IMPOSTO)+"\n");
					linha();
				} 
				//OPÇÃO 2 - À VISTA CARTÃO
				else if (op == '2') {
					notaFiscal();
					System.out.print("\n(+)SUBTOTAL:                                            R$"+ df.format(valorTotal));
					System.out.print("\n(+)ACRÉSCIMO PGTO CARTÃO DE CRÉDITO (10%):              R$ "+ df.format(valorTotal*0.10));
					valorFinal = valorTotal + valorTotal*0.10;
					System.out.print("\n(=)TOTAL A PAGAR:                                       R$"+ df.format(valorFinal)+"\n");
					linha();
					System.out.print("\nVal. Aprox. dos Tributos (9%):                          R$"+ df.format(valorTotal*IMPOSTO)+"\n");
					linha();
				} 
				//OPÇÃO 3 - 2X NO CARTÃO
				else if (op == '3') {
					notaFiscal();
					System.out.print("\n(+)SUBTOTAL:                                            R$"+ df.format(valorTotal));
					System.out.print("\n(+)ACRÉSCIMO PGTO CARTÃO DE CRÉDITO (15%):              R$ "+ df.format(valorTotal*0.15));
					valorFinal = valorTotal + valorTotal*0.15;
					System.out.print("\n(=)TOTAL A PAGAR:                                       R$"+ df.format(valorFinal));
					System.out.print("\n(/)VALOR PARCELA:                                    2x R$ "+ df.format(valorFinal/2)+"\n");
					linha();
					System.out.print("\nVal. Aprox. dos Tributos (9%):                          R$ "+ df.format(valorTotal*IMPOSTO)+"\n");
					linha();	
				}

			} else {
				System.out.print("\nVocê não adicionou produtos ao carrinho...\n");
			}
	    	System.out.print("\n► Deseja voltar para a página inicial [S/N] ? : ");
	    	voltarSite = sc.next().toUpperCase().charAt(0);
	    	while (true) {
	    		if (voltarSite == 'S' || voltarSite == 'N') {
	    			break;
	    		}
	    		else {
	    			System.out.print("Opção inválida, tente novamente...");
	    			System.out.print("\n► Deseja voltar para a página inicial [S/N] ? : ");
	    			voltarSite = sc.next().toUpperCase().charAt(0);
	    		}
	    	}
	    	limpaCarrinho();
	    } while(voltarSite == 'S');
	    System.out.println("\nObrigade e volte sempre!");
	    System.out.println("\nFim do programa!!");
	}
	
	//FUNÇÕES DO PROGRAMA
	public static void limpaTela() {
        for (int x=0;x<10;x++){
        System.out.println("\n");
        }
    }

	public static void linha() {
		for (int i=0; i<66; i++) {
			System.out.print("▬");
		}
	}
	
	public static void insereSlogan() {
		linha();
		System.out.println();
		System.out.println("■■                          ☼ AVOÁ G5 ☼                         ■■");
		System.out.println("■■■■■■■           ~ NORDESTINA, LEVE E AUTORAL ~           ■■■■■■■");
		linha();
		System.out.println();
	}
	
	public static void menuProdutos() {
		System.out.print("COD\t\tPRODUTO\t\t\tVALOR\t\tESTOQUE\n");
		for(Produto item : lista) {
			//System.out.println(item.toString());
			System.out.println(item.getCodProduto()+"\t\t"+item.getProduto()+"\t\t"+item.getPreco()+"\t\t"+item.getEstoque()+((item.getEstoque()>0)?" ":"-INDISPONÍVEL"));
		}
	}
	
	public static void tituloCarrinho() {
		insereSlogan();
		System.out.println("CARRINHO DE COMPRAS: ");
		System.out.println("COD\tPRODUTO\t\t  VALOR\t\tQUANTIDADE\tTOTAL(R$)");	
	}
	
	public static void opcoesPagamento() {
		System.out.print("\nOPÇÕES DE PAGAMENTO: ");
		System.out.print("\n[1] À VISTA 10% OFF ");
		System.out.print("\n[2] 1x NO CARTÃO + 10% ");
		System.out.print("\n[3] 2x NO CARTÃO + 15% \n");
	}
	
	public static void notaFiscal() {
		
		String auxStringContador="";
		int d = 6;
		notaFiscalEletronica ++;
		String stringContador= String.valueOf(notaFiscalEletronica);
		for (int x = 0; auxStringContador.length() < (d-stringContador.length()); x++) {
			auxStringContador += "0";
		}
		limpaTela();
		insereSlogan();
		System.out.print("Nota Fiscal de Servicos Eletronica - NFS-e No.: "+auxStringContador + stringContador);
		System.out.print("\nRazao Social: AVOÁ STORE G5 LTDA");
		System.out.print("\nE-mail: faleconosco@avoa_g5.com");
		System.out.print("\nCNPJ: 123.456.789/0001-g5\n");
		linha();
		System.out.println("\nCOD\tPRODUTO\t\t  VALOR\t\tQUANTIDADE\tTOTAL(R$)");	
		for(Produto escolhido : lista) {
			if(escolhido.getCarrinho() != 0) {
				System.out.println(escolhido.getCodProduto()+"\t"+escolhido.getProduto()+"\t  R$"+escolhido.getPreco()+"\t"+escolhido.getCarrinho()+"\t\tR$"+escolhido.getPreco()*escolhido.getCarrinho());
			}	
		}
		linha();
	}
	
	public static void limpaCarrinho() {
		for(Produto escolhido : lista) {
			escolhido.setCarrinho(0);
			valorTotal= 0.00;
			valorFinal=0.00;
		}
	}
}

