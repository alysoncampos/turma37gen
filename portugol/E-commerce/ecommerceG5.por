programa
{
	/* 
	 *  PROJETO E-COMMERCE - LOJA DE ROUPAS PROGRAMADO POR: ÁLYSON CAMPOS, 
	 * BRUNA GUIMARÃES, MATHEUS AMÂNCIO, RENAN UCHOA E SYLVIA MONTEIRO.
	 */
	 
	inclua biblioteca Matematica --> math
	inclua biblioteca Util  
	const real IMPOSTO=0.09
	cadeia codigoProduto[10] = {"G5-1", "G5-2", "G5-3" , "G5-4", "G5-5", "G5-6", "G5-7", "G5-8", "G5-9", "G5-10"}
	cadeia produto[10]= {"Cropped Chave  ", "Vestido Verbo  ", "Vestido Floral ", "Camisa Reforma ", "Bermuda Alfaia ", "Macacao Caminho", "Macacao Varanda", "Macacao Brisa  ", "Calça Flow     ", "Saia Vértica   "}
	real valor[10]={112.00, 160.00, 150.00, 120.00, 180.00, 200.00, 190.00, 210.50, 119.90, 110.80}
	inteiro estoque[10] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}
	inteiro codigo[10] = {1,2,3,4,5,6,7,8,9,10}
	inteiro carrinho[10] 
	inteiro auxCodigo=0
	inteiro opPagamento=0, numNota=0, qtd=0
	real valorTotal=0.00, valorImposto= 0.00, valorFinal=0.00
	caracter desejaComprar='S', continua='S', voltarSite='S'
	
	funcao inicio() 
	{
		//INÍCIO LOOP PROGRAMA
		faca {
			//TELA INICIAL E VALIDA ENTRADA
			faca {
				limpa()
				insereSlogan()
				escreva("\n\n")
				escreva("\t\t>>SEJA BEM VINDE À AVOÁ G5<<")
				escreva("\n\n")
				escreva("\t\tDESEJA FAZER COMPRAS [S/N] ? : ")
				leia(desejaComprar)
			} enquanto (desejaComprar!='S' e desejaComprar!='s' e desejaComprar!='N' e desejaComprar!='n') 
			se (desejaComprar == 'N' ou desejaComprar == 'n'){
				limpa()
				insereSlogan()
				escreva("\n\n")
				escreva("\tPoxa, que pena!! Os nossos preços estão ótimos!!")
				escreva("\n\t\tMas te vejo em breve, tá??")
				escreva("\n\n")
			}
			senao se(desejaComprar == 'S' ou desejaComprar == 's'){
				//INICIO LAÇO DA COMPRA
				faca {
					//APRESENTAÇÃO TABELA PRODUTOS
					limpa()	
					insereSlogan()
					menu()
					escreva("\nDigite o código do produto G5-")
					leia(auxCodigo)
					//ESCOLHE PRODUTO
					escolha(auxCodigo){
						caso 1:
							adicionaCarrinho()
							pare
						caso 2:
							adicionaCarrinho()
							pare
						caso 3:
							adicionaCarrinho()
							pare
						caso 4:
							adicionaCarrinho()
							pare
						caso 5:
							adicionaCarrinho()
							pare
						caso 6:
							adicionaCarrinho()
							pare
						caso 7:
							adicionaCarrinho()
							pare
						caso 8:
							adicionaCarrinho()
							pare
						caso 9:
							adicionaCarrinho()
							pare
						caso 10:
							adicionaCarrinho()
							pare
						caso contrario:
							escreva("\nCódigo inválido, tente novamente!!\n")
					}
					//PERGUNTA PARA PROSSEGUIR COM A COMPRA
					escreva("\n\nDeseja continuar a sua compra [S/N] ? : ")
					leia(continua)	
					enquanto (continua!='S' e continua!='s' e continua!='N' e continua!='n') {
						escreva("\n\nDeseja continuar a sua compra [S/N] ? : ")
						leia(continua)		
					}
				} enquanto (continua == 'S' ou continua == 's')
				limpa()
				insereSlogan()
				carrinhoCompras()
				pagamento()	
			}
			//PERGUNTA PARA RETORNAR AO SITE
			escreva("\nDeseja voltar para o site [S/N] ? :")
			leia(voltarSite)
			enquanto (voltarSite!='S' e voltarSite!='s' e voltarSite!='N' e voltarSite!='n') {
				escreva("\n\nDeseja voltar para o site [S/N] ? : ")
				leia(voltarSite)		
			}
			//ZERA CARRINHO
			limpaCarrinho()
		} enquanto (voltarSite == 'S' ou voltarSite == 's')
		escreva("\nObrigado e volte sempre!\n")
		escreva("\nFim do programa!")
	}

	funcao insereSlogan(){
		escreva("\n===================================================================")
		escreva("\n*                         * AVOÁ G5 *                             *")
		escreva("\n*                ~ NORDESTINA, LEVE E AUTORAL ~                   *")
		escreva("\n===================================================================")
	}
	
	funcao menu() {
		escreva("\n|COD\t\t|PRODUTO\t\t|VALOR\t\t|QUANTIDADE\n")
		para (inteiro x=0; x<10; x++){
			escreva("|",codigoProduto[x],"\t\t|",produto[x], "\t|R$ ",valor[x],"\t|", estoque[x])
			escreva("\n")		
		}
	}

	funcao adicionaCarrinho() {
		para (inteiro x=0; x<10; x++){
			se (codigo[x] == auxCodigo){
				escreva("\nDigite a quantidade desejada: ")
				leia(qtd)
				//VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
				se (qtd<0) {
					escreva("\nImpossível realizar, número negativo.\n")
				} senao se (qtd==0){
					escreva("\nImpossível realizar, nenhuma quantidade escolhida.\n")
				} senao se (qtd>0 e qtd>estoque[x]){
					escreva("\nImpossível realizar, quantidade não disponível no estoque!\n")
				} senao se (qtd>0 e qtd<=estoque[x]) {
					//ATUALIZA E EXIBE CARRINHO
					carrinho[x] = carrinho[x] + qtd
					estoque[x] = estoque[x] - qtd
					insereSlogan()
					carrinhoCompras()
				}	
			} 	
		}
	}
	//CARRINHO DE COMPRAS
     funcao carrinhoCompras(){
     	escreva("\n|CARRINHO DE COMPRAS: ")
          escreva("\n|COD\t\t|PRODUTO\t\t|VALOR\t\t|QUANTIDADE\n")
		para (inteiro x=0; x<10; x++){
			 se (carrinho[x]>0) {
			 	escreva("|",codigoProduto[x],"\t\t|",produto[x], "\t|R$ ",valor[x],"\t|", carrinho[x],"\n")
			}
		}
     }

	funcao pagamento(){
		//CÁLCULO DO CARRINHO FINAL
		para (inteiro x=0; x<10; x++){
			 se (carrinho[x]>0) {
				valorTotal = valorTotal + (valor[x] * carrinho[x])
			 }
		}
		se(valorTotal>0){
			//OPÇÕES DE PAGAMENTO
			escreva("\nSUBTOTAL: R$",valorTotal)
			escreva("\n\nOPÇÕES DE PAGAMENTO: ")
			escreva("\n[1] À VISTA 10% OFF ")
			escreva("\n[2] 1x NO CARTÃO + 10% ")
			escreva("\n[3] 2x NO CARTÃO + 15%: ")
			escreva("\n\nDigite a opção desejada: ")
			leia(opPagamento)
			se (opPagamento != 1 e opPagamento != 2 e opPagamento != 3){
				enquanto (opPagamento != 1 e opPagamento != 2 e opPagamento != 3){
					escreva("\nOpção inválida, tente novamente!!\n")
					escreva("\nDigite a opção desejada: ")
					leia(opPagamento)
					}
			}
			//OPÇÃO 1 - À VISTA
			se(opPagamento==1){
				insereSlogan()
				notaFiscal()
				escreva("\nSUBTOTAL: R$ ",valorTotal)
				escreva("\nDESCONTO (10%): R$ ",math.arredondar(valorTotal*0.10,2))
				valorFinal = valorTotal - valorTotal*0.10
				escreva("\nTOTAL A PAGAR: ", valorFinal)
				escreva("\n-------------------------------------------------------------------")
				escreva("\nVal. Aprox. dos Tributos (9%): R$ ",math.arredondar(valorTotal*IMPOSTO,2))
				escreva("\n-------------------------------------------------------------------")
			} 
			//OPÇÃO 2 - À VISTA CARTÃO
			senao se(opPagamento==2){
				insereSlogan()
				notaFiscal()
               	escreva("\nSUBTOTAL: R$ ",valorTotal)
				escreva("\nACRÉSCIMO PGTO CARTÃO DE CRÉDITO (10%): R$ ",math.arredondar(valorTotal*0.10,2))
				valorFinal = valorTotal + valorTotal*0.10
				escreva("\nTOTAL A PAGAR: ", valorFinal)
				escreva("\n-------------------------------------------------------------------")
				escreva("\nVal. Aprox. dos Tributos (9%): R$ ",math.arredondar(valorTotal*IMPOSTO,2))
				escreva("\n-------------------------------------------------------------------")
			} 
			//OPÇÃO 3 - 2X NO CARTÃO
			senao se (opPagamento==3){
				insereSlogan()
				notaFiscal()
				escreva("\nSUBTOTAL: R$ ",valorTotal)
				escreva("\nACRÉSCIMO PGTO CARTÃO DE CRÉDITO (15%): R$ ",math.arredondar(valorTotal*0.15,2))
				valorFinal = valorTotal + valorTotal*0.15
				escreva("\nTOTAL A PAGAR: R$ ",valorFinal)
				escreva("\nVALOR PARCELA: 2x R$",math.arredondar(valorFinal/2, 2))
				escreva("\n-------------------------------------------------------------------")
				escreva("\nVal. Aprox. dos Tributos (9%): R$ ",math.arredondar(valorTotal*IMPOSTO,2))
				escreva("\n-------------------------------------------------------------------")
			} 
		} 
		//CARRINHO VAZIO
		senao {
			limpa()
			insereSlogan()
			escreva("\nPoxa, você não realizou compras!")
			escreva("\nAté a proxima!")
		}
	}
	
	funcao notaFiscal(){
		limpa()
		insereSlogan()
		escreva("\n|Nota Fiscal de Servicos Eletronica - NFS-e No.: ")
		para(inteiro x=0; x<14;x++){
			escreva(numNota = Util.sorteia(0, 9))
		}
		escreva("\n|Razao Social: AVOÁ STORE G5 LTDA")
		escreva("\n|E-mail: faleconosco@avoa_g5.com")
		escreva("\n|CNPJ: 123.456.789/0001-g5")
		escreva("\n|COD\t\t|PRODUTO\t\t|VALOR\t\t|QUANTIDADE\n")
		para(inteiro x=0; x<10; x++){
			se(carrinho[x]>0 e carrinho[x]<=10){
				escreva("|",codigoProduto[x],"\t\t|",produto[x], "\t|R$ ",valor[x],"\t|", carrinho[x],"\n")	
			}
		}
	}
	//ZERA CARRINHO
	funcao limpaCarrinho(){
		para (inteiro x=0; x<10; x++){
			carrinho[x] = 0
			valorTotal = 0.00
			valorFinal= 0.00
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */