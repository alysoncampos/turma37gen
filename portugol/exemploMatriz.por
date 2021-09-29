programa
{
	
	funcao inicio()
	{
		cadeia agenda[24][31]
		inteiro auxDia=0, auxHora=0
		caracter op 
		faca {
			escreva("Digite o dia do evento: ")
			leia(auxDia)
			auxDia--
			escreva("Digite a hora do evento: ")
			leia(auxHora)
			escreva("Evento: ")
			leia(agenda[auxHora][auxDia])
			escreva("Continua S/N: ")
			leia(op)
		} enquanto (op=='S')

		para (inteiro linha=0; linha<24; linha++){
			para(inteiro coluna=0; coluna<31; coluna++){
				se (agenda[linha][coluna] != ""){
					escreva("Evendo no dia ",(coluna+1)," hora:",linha," : ",agenda[linha][coluna])
					escreva("\n")
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */